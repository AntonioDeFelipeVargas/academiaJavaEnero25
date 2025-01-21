package com.curso.v0;

//Overloading (SobreCarga)
//Nombre del método es igual
//Tener diferente firma (Diferentes Parametros)
//El valor de retorno puede ser diferente
//Modificador de acceso puede ser diferente

public class Falcon {
	public void fly(int numMiles) {
	}

	public void fly(short numFeet) {
	}

	public boolean fly() {
		return false;
	}

	void fly(int numMiles, short numFeet) {
	}

	public void fly(short numFeet, int numMiles) throws Exception {
	}

}
