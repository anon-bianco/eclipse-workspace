
public class Main {

	public static void main(String[] args) {
		
		String a = "madam";
		String b = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			b = b + a.charAt(i);
		}
		
		if(b.equals(a)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}
