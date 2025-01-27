package com.book.exception.v1;

class CanNotHopException extends Exception {}
class Hopper {
	public void hop() throws CanNotHopException {}
}
class Bunny extends Hopper {
	@Override
	public void hop()  {}
	
	public static void main(String[] args) {
		Bunny bunny = new Bunny();
		bunny.hop();
		
		Hopper hopper = new Bunny();
		try {
			hopper.hop();
		} catch (CanNotHopException e) {
			e.printStackTrace();
		}
	}
	
	
}