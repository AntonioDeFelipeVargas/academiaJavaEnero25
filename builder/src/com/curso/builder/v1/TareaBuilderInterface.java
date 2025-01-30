package com.curso.builder.v1;

import java.util.Date;

public interface TareaBuilderInterface {

	TareaBuilderInterface setTarea(String tarea);

	TareaBuilderInterface setDescripcion(String descripcion);

	TareaBuilderInterface setDefinidaPor(String definidaPor);

	TareaBuilderInterface setAsignadaA(String asignadaA);

	TareaBuilderInterface setHecho(boolean hecho);

	TareaBuilderInterface setFechaLimite(Date fechaLimite);

	Tarea build();

}
