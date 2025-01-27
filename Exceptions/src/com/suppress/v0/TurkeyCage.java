package com.suppress.v0;

public class TurkeyCage implements AutoCloseable {
	@Override
	public void close() {
		System.out.println("Close gate");
	}

	public static void main(String[] args) {
		try (TurkeyCage t = new TurkeyCage()) {
			System.out.println("Put turkeys in");
		}
	}

}
