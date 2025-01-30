package com.curso.builder.v1;

public class Cliente2 {
	
	public static void main(String[] args) {
		
		Tarea tarea = new TareaBuilder(30)
				.setAsignadaA("Aristobulo")
				.setTarea("Comprar Pan")
				.setDefinidaPor("Urbano")
				.build();
		
		System.out.println(tarea);
	}

}
