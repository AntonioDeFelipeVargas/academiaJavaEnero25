package varargs;

public class Principal {

	public static void main(String[] args) {
		System.out.println(overload());
		System.out.println(overload("A"));
		System.out.println(overload("A","B","C","D"));
	}
	
	static String overload(String s) {
		return "1";
	}
	static String overload(String... s) {
		return "2";
	}

}
