package simuladores.v0;

class Beta {

	public int h = 4;

	public int getH() {
		System.out.println("Baap " + h); //1: Baap 4
		return h;
	}

	public static void main(String[] args) {
		Beta b = new Beta();
		System.out.println(b.getH()); //2: 4

	}
}