package com.curso.builder.v1;

public class Cliente1 {
	
	public static void main(String[] args) {
		TareaBuilderInterface tareaBuilder = new TareaBuilderChino(20)
				.setHecho(true)
				.setTarea("Comprar leche")
				.setDefinidaPor("Epeneto")
				.setAsignadaA("Andronico");
		
		Tarea tarea = tareaBuilder.build();
		
		System.out.println(tarea);
	}

}
