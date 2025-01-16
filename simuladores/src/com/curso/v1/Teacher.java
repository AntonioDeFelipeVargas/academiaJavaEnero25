package com.curso.v1;

//public,protected,*default(private package),private

class Teacher {
	private void teach(String student) {}
}

class Prof extends Teacher{
	//@Override
	void teach(String estudiante) {}
}  
