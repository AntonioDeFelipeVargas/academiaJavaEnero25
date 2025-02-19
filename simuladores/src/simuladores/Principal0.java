package simuladores;

class A{
}
class B extends A{
}
class C extends B{
}

class X {
	B getB() { return new B();}
}

class Y extends X {
	//protected B getB(){ return new C(); } //SI
	//C getB(){ return new C(); } //SI
	
	//A getB(){ return new A(); }
//	public C getB() {
//		return new B();
//	}
}

public class Principal0 {

	public static void main(String[] args) {

	}

}
