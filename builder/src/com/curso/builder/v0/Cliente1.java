package com.curso.builder.v0;

public class Cliente1 {
	
	public static void main(String[] args) {
		Tarea tarea = new TareaBuilder(20)
				.setHecho(true)
				.setTarea("Comprar leche")
				.setDefinidaPor("Epeneto")
				.setAsignadaA("Andronico")
				.build();
		
		System.out.println(tarea);
	}

}
