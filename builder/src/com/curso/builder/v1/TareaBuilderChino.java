package com.curso.builder.v1;

import java.util.Date;

public class TareaBuilderChino implements TareaBuilderInterface {
	
	private final long id;
    private String tarea = "";
    private String descripcion = ""; 
    private String definidaPor = ""; 
    private String asignadaA = ""; 
    private boolean hecho = false;
    private Date fechaLimite = new Date();
    
    public TareaBuilderChino(long id) {
    	this.id = id;
    }

    @Override
	public TareaBuilderChino setTarea(String tarea) {
    	//this.tarea = translateChino(tarea);
    	this.tarea = "#$%&$##$";
		return this;
	}

    @Override
	public TareaBuilderChino setDescripcion(String descripcion) {
		this.descripcion = descripcion+"$";
		return this;
	}

    @Override
	public TareaBuilderChino setDefinidaPor(String definidaPor) {
		this.definidaPor = definidaPor+"$";
		return this;
	}

    @Override
	public TareaBuilderChino setAsignadaA(String asignadaA) {
		this.asignadaA = asignadaA+"$";
		return this;
	}

    @Override
	public TareaBuilderChino setHecho(boolean hecho) {
		this.hecho = hecho;
		return this;
	}

    @Override
	public TareaBuilderChino setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
		return this;
	}
	
    @Override
	public Tarea build() {
		return new Tarea(id,tarea,descripcion, definidaPor,
				asignadaA,hecho,fechaLimite);
	}

}
