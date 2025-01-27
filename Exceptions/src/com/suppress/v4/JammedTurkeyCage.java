package com.suppress.v4;

public class JammedTurkeyCage implements AutoCloseable {

	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}

	public static void main(String[] args) {

		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			System.out.println("PASO POR TRY");
			throw new UnsupportedOperationException("Turkeys ran off");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Caught: " + e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("**Suppressed**");
				System.out.println(t);
				System.out.println("Suppressed: " + t.getMessage());
			}
		} finally {
			try {
				throw new NullPointerException();
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}

		System.out.println("EndProgram");
	}

}
