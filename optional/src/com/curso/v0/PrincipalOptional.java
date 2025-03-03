package com.curso.v0;

import java.util.Optional;

public class PrincipalOptional {

	public static void main(String[] args) {
		
//		String nullName = "Patrobas";
//		Optional<String> optString = Optional.ofNullable(nullName); //Optional<String>
//		String name = optString.orElse("john"); //String
		
//	    String name = Optional.ofNullable(nullName) //Optional<String>
//				  	          .orElse("john"); //String
//xs	    System.out.println(name);

		//whenCreatesEmptyOptional_thenCorrect();
		//givenNonNull_whenCreatesNonNullable_thenCorrect();
		//givenNull_whenThrowsErrorOnCreate_thenCorrect();
		//givenNonNull_whenCreatesNullable_thenCorrect();
		//givenOptional_whenIsPresentWorks_thenCorrect();
		//givenOptional_whenIfPresentWorks_thenCorrect();
	}
	
	public static  void givenOptional_whenIfPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.ofNullable(null);
	    opt.ifPresent(name -> 
	    		System.out.println(name.length()));
	    System.out.println("*");
	}
	
	static public void givenOptional_whenIsPresentWorks_thenCorrect() {
		boolean b;
	    Optional<String> opt = Optional.of("Baeldung");
	    b = opt.isPresent(); 
	    System.out.println(b); //true
	    
	    opt = Optional.ofNullable(null);
	    b = opt.isPresent();
	    System.out.println(b); //false
	}
	
	
	public static  void givenNonNull_whenCreatesNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.ofNullable(name);
	    System.out.println(opt);
	    boolean b = opt.isPresent();
	    System.out.println(b);
	}
	
	public static void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
	    String name = null;
	    try {
	    	Optional.of(name);
	    }catch(NullPointerException e) {
	    	System.out.println(e);
	    }
	}
	
	public static void givenNonNull_whenCreatesNonNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.of(name);
	    boolean b = opt.isPresent();
		System.out.println(b);
	}
	
	public static  void whenCreatesEmptyOptional_thenCorrect() {
		 Optional<String> empty = Optional.empty(); 
		 boolean b = empty.isPresent();
		 System.out.println(empty);
		 System.out.println(b);
	}
	


}
