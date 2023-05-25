import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word to find the no of vowels: ");
		String a = sc.next();
		
		int count = 0;
		
		for(int i=0; i<a.length(); i++) {
			
			char ch = a.charAt(i);
			
			switch(ch) {
			case 'a': count++; break;
			case 'e':count++; break;
			case 'i':count++; break;
			case 'o':count++; break;
			case 'u':count++; break;
			}
		}
		
		System.out.println("The vowels count is " + count);

	}

}
