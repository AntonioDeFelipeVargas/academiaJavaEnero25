package equals;

public class Principal {

	public static void main(String[] args) {

		int x = 5;
		int y = 5;
		//System.out.println(x.equals(y);
		
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		System.out.println(sb1.equals(sb2)); //false
		
		String s1 = "Hola";
		String s2 = new String("Hola");
		System.out.println(s1.equals(s2)); //true


		

	}

}
