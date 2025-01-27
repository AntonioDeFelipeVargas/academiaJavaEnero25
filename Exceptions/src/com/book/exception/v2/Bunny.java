package com.book.exception.v2;

class CanNotHopException extends Exception {}

class CanNotHopExceptionChild extends CanNotHopException {}

class Hopper {
	public void hop() throws CanNotHopException {}
}
class Bunny extends Hopper {
	@Override
	public void hop() throws CanNotHopExceptionChild {}
	
	public static void main(String[] args) {
		Bunny bunny = new Bunny();
		try {
			bunny.hop();
		} catch (CanNotHopExceptionChild e) {
			e.printStackTrace();
		}
		
		Hopper hopper = new Bunny();
		try {
			hopper.hop();
		} catch (CanNotHopException e) {
			e.printStackTrace();
		}
	}
	
	
}