package com.curso.v0;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestOptional {

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

	@Test
	void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
		String name = null;
		assertThrows(NullPointerException.class, () -> {
			Optional.of(name);
		});
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

	@Disabled
	@Test
	public void givenOptional_whenIfPresentWorks_thenCorrect() {
		Optional<String> opt = Optional.of("baeldung");
		opt.ifPresent(name -> System.out.println(name.length()));
	}

	@Test
	public void whenOrElseWorks_thenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElse("john");
		assertEquals("john", name);
	}

	@Test
	void whenOrElseThrowWorks_thenCorrect() {
		String nullName = null;
		assertThrows(IllegalArgumentException.class, () -> {
			String name = Optional.ofNullable(nullName)
					.orElseThrow(IllegalArgumentException::new);
		});
	}
	
	@Test
	void whenNoArgOrElseThrowWorks_thenCorrect() {
		String nullName = null;
		assertThrows(NoSuchElementException.class, () -> {
			String name = Optional.ofNullable(nullName)
					.orElseThrow();
		});
	}
	
	@Test
	public void givenOptional_whenGetsValue_thenCorrect() {
	    Optional<String> opt = Optional.of("baeldung");
	    String name = opt.get();
	    assertEquals("baeldung", name);
	}

	@Test
	void givenOptionalWithNull_whenGetThrowsException_thenCorrect() {
		assertThrows(NoSuchElementException.class, () -> {
			Optional<String> opt = Optional.ofNullable(null);
			String name = opt.get();
		});
	}

}
