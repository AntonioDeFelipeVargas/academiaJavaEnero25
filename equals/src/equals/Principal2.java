package equals;


class Dog{}

class Cat{}

public class Principal2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog.equals(cat));
	}

}
