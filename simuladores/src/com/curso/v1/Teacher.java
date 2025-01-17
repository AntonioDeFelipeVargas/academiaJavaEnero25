package com.curso.v1;

//public,protected,*default(private package),private

class Teacher {
	void teach(String student) {}
}

abstract class Prof extends Teacher{
	@Override
	public abstract void teach(String s);
	
//	@Override
//	public final void teach(String s){}
	
//	@Override
//	protected void teach(String s){}
	
	//private void teach(int i) {}
	//public void teach(){}
}  
