package com.curso.v0;

class Dog{
	String name;
}

class Cat{
	String name;
}

public class Principal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "Firulais";
		Cat cat = new Cat();
		cat.name = "Firulais";

		
		System.out.println(dog.name.equals(cat.name)); //true
	}

}
