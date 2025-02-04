package com.curso.v1;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

public class TestOptional {

	@Test
	public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
	    String text = "Text present";

	    System.out.println("Using orElseGet:");
	    String defaultText = Optional.ofNullable(text)
	    		                     .orElseGet(() -> getMyDefault());
	    assertEquals("Text present", defaultText);

	    System.out.println("Using orElse:");
	    defaultText = Optional.ofNullable(text)
	    		              .orElse(getMyDefault());
	    assertEquals("Text present", defaultText);
	}
	
	public String getMyDefault() {
	    System.out.println("$$$ Getting Default Value"); //1
	    return "Default Value";
	}

}
