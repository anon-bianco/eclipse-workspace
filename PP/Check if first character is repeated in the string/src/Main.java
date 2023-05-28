import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word to check whether the first character is repeated or not: ");
		String a = sc.next();
		
		char ch = a.charAt(0);
		boolean repeat = false;
		
		for(int i=1; i<a.length(); i++) {
			if(ch==a.charAt(i)) {
				System.out.println(ch + " character repeated");
				repeat = true;
			}	
		}
		
		if(repeat==false) {
			System.out.println(ch + " character not repeated");
		}

	}

}
