package com.curso.v1;

class Almacen {
    private int productos = 0;
    private final int capacidad = 5;
    private boolean activo = true;

    public void detener() {
        activo = false;
    }

    public boolean estaActivo() {
        return activo;
    }

    public synchronized void producir() throws InterruptedException {
        if (!activo) return;
        while (productos >= capacidad && activo) {
            wait();
        }
        if (!activo) return;
        productos++;
        System.out.println("Producto producido. Total: " + productos);
        notify();
    }

    public synchronized void consumir() throws InterruptedException {
        if (!activo) return;
        while (productos <= 0 && activo) {
            wait();
        }
        if (!activo) return;
        productos--;
        System.out.println("Producto consumido. Total: " + productos);
        notify();
    }
}

class Productor implements Runnable {
    private Almacen almacen;

    public Productor(Almacen almacen) {
        this.almacen = almacen;
    }

    public void run() {
        while(almacen.estaActivo()) {
            try {
                almacen.producir();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Productor: terminando...");
    }
}

class Consumidor implements Runnable {
    private Almacen almacen;

    public Consumidor(Almacen almacen) {
        this.almacen = almacen;
    }

    public void run() {
        while(almacen.estaActivo()) {
            try {
                almacen.consumir();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Consumidor: terminando...");
    }
}

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Thread productor = new Thread(new Productor(almacen));
        Thread consumidor = new Thread(new Consumidor(almacen));
        
        productor.start();
        consumidor.start();

        // El programa se ejecutará por 10 segundos
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        almacen.detener();
        System.out.println("Terminando el programa...");
    }
}