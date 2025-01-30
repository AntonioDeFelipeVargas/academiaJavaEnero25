package com.curso.builder.privado;

public class Cliente1 {
	
	public static void main(String[] args) {
		
		Tarea tarea = new Tarea.TareaBuilder(20)
				.setTarea("Comprar leche")
				.setDefinidaPor("Epeneto")
				.setAsignadaA("Andronico")
				.build();
		
		System.out.println(tarea);
		
		//Tarea tarea2 = new Tarea(0, null, null, null, null, false, null);
	}

}
