package com.suppress.v2;

public class JammedTurkeyCage implements AutoCloseable {
	
	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}
	
	public static void main(String[] args) {
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			System.out.println("PASO POR TRY");
			throw new UnsupportedOperationException("Turkeys ran off");
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("Caught: " + e.getMessage()); 
		}
		
		System.out.println("EndProgram");
	}

	

}
