package com.curso.v0;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class User{
	String name;
	String mail;
	int id;
	public User(String name, String mail, int id) {
		this.name = name;
		this.mail = mail;
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", mail=" + mail + ", id=" + id + "]";
	}
	
}

public class PrincipalSuppliers2 {

	public static void main(String[] args) {

		Supplier<List<User>> userGenerator = () -> {
		    Random rand = new Random();
		    return IntStream.range(0, 100)
		        .mapToObj(i -> new User(
		            "user" + i,
		            "test" + rand.nextInt(1000) + "@email.com",
		            rand.nextInt(100)))
		        .collect(Collectors.toList());
		};
		
		List<User> listaUsuarios = userGenerator.get();
		
		for(User u:listaUsuarios)
			System.out.println(u);

		
	}

}
