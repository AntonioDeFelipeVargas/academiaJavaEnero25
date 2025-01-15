package employee;

import aquarium.Water;
import aquarium.jellies.*;

public class WaterFiller {
	
	//Variables de instancia de clase (Objeto)
	//String cadena = "Hello";
	Water water = new Water();
	aquarium.jellies.Water water2 = new aquarium.jellies.Water();
	
	public static void main(String[] args) {
		//System.out.println(new WaterFiller().cadena);
		System.out.println(new WaterFiller().water.salty); //false
		
		System.out.println(
				new WaterFiller().water2.salty); //true
	}
	
}
