package com.book.exception.v0;

class CanNotHopException extends Exception {
}

class Hopper {
	public void hop() throws CanNotHopException {
	}
}

class Bunny extends Hopper {
	@Override
	public void hop()  {
	}
}