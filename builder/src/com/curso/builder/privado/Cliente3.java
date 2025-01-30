package com.curso.builder.privado;

import java.util.Date;

public class Cliente3 {
	
	public static void main(String[] args) {
		
		Tarea tarea = new Tarea.TareaBuilder(35)
				.setFechaLimite(new Date())
				.setAsignadaA("Filogono")
				.setDescripcion("De maiz azul")
				.setHecho(false)
				.setTarea("Comprar tortillas")
				.setDefinidaPor("Patrobas")
				.build();
		
		System.out.println(tarea);
		
		Tarea tarea2 = new Tarea.TareaBuilder(45)
				.setFechaLimite(new Date())
				.build();
		
		System.out.println(tarea2);
		
	}

}
