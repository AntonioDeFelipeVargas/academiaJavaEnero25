package com.curso.builder.v1;

import java.util.Date;

public class TareaBuilder implements TareaBuilderInterface {
	
	private final long id;
    private String tarea = "";
    private String descripcion = ""; 
    private String definidaPor = ""; 
    private String asignadaA = ""; 
    private boolean hecho = false;
    private Date fechaLimite = new Date();
    
    public TareaBuilder(long id) {
    	this.id = id;
    }

    @Override
	public TareaBuilder setTarea(String tarea) {
		this.tarea = tarea;
		return this;
	}

    @Override
	public TareaBuilder setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

    @Override
	public TareaBuilder setDefinidaPor(String definidaPor) {
		this.definidaPor = definidaPor;
		return this;
	}

    @Override
	public TareaBuilder setAsignadaA(String asignadaA) {
		this.asignadaA = asignadaA;
		return this;
	}

    @Override
	public TareaBuilder setHecho(boolean hecho) {
		this.hecho = hecho;
		return this;
	}

    @Override
	public TareaBuilder setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
		return this;
	}
	
    @Override
	public Tarea build() {
		return new Tarea(id,tarea,descripcion, definidaPor,
				asignadaA,hecho,fechaLimite);
	}

}
