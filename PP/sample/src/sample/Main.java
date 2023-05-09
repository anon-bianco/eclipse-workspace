package sample;

class Abc{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int c) {
		a = c;
	}
	
	
	
}

public class Main {

	public static void main(String[] args) {
		
		Abc obj = new Abc();
		
		obj.setA(50);
		
		System.out.println(obj.getA());

	}

}
