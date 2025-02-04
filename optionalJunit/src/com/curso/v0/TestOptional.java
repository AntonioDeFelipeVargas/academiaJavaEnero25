package com.curso.v0;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;

public class TestOptional {

	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
	    Optional<String> empty = Optional.empty();
	    assertFalse(empty.isPresent());
	}
	
	@Test
	public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.of(name);
	    assertTrue(opt.isPresent());
	}
	
	@Test(expected = NullPointerException.class)
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
	    String name = null;
	    Optional.of(name);
	}
	
	@Test
	public void givenNonNull_whenCreatesNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.ofNullable(name);
	    assertTrue(opt.isPresent());
	}
	
	@Test
	public void givenNull_whenCreatesNullable_thenCorrect() {
	    String name = null;
	    Optional<String> opt = Optional.ofNullable(name);
	    assertFalse(opt.isPresent());
	}
	
	@Test
	public void givenOptional_whenIsPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.of("Baeldung");
	    assertTrue(opt.isPresent());

	    opt = Optional.ofNullable(null);
	    assertFalse(opt.isPresent());
	}
	
	@Test
	public void givenAnEmptyOptional_thenIsEmptyBehavesAsExpected() {
	    Optional<String> opt = Optional.of("Baeldung");
	    assertFalse(opt.isEmpty());

	    opt = Optional.ofNullable(null);
	    assertTrue(opt.isEmpty());
	}
	
	@Ignore
	@Test
	public void givenOptional_whenIfPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.of("baeldung");
	    opt.ifPresent(name -> 
	    		System.out.println(name.length()));
	}
	
	@Test
	public void whenOrElseWorks_thenCorrect2() {
	    String nullName = "Patrobas";
	    String name = Optional.ofNullable(nullName)
	    					  .orElse("john");
	    assertNotEquals("john", name);
	}
	
	@Test
	public void whenOrElseWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName)
	    					  .orElse("john");
	    assertEquals("john", name);
	}
	@Test
	public void whenOrElseGetWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName)
	    					  //         Supplier<String>
	    		              .orElseGet(() -> "john");
	    assertEquals("john", name);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenOrElseThrowWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName) //Optional.empty
	    		              .orElseThrow(
	    		            	()->new IllegalArgumentException());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void whenNoArgOrElseThrowWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName)
	    		              .orElseThrow();
	}
	
	@Test
	public void givenOptional_whenGetsValue_thenCorrect() {
	    Optional<String> opt = Optional.of("baeldung");
	    String name = opt.get();
	    assertEquals("baeldung", name);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void givenOptionalWithNull_whenGetThrowsException_thenCorrect() {
	    Optional<String> opt = Optional.ofNullable(null);
	    String name = opt.get();
	}

}
