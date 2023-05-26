import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word to find no of vowels: ");
		String a = sc.next();
		
		int countOfA=0,countOfE=0, countOfI=0, countOfO=0, countOfU=0;
		
		for(int i=0; i<a.length(); i++) {
			
			char ch = a.charAt(i);
			
			switch(ch) {
			case 'a': countOfA++; break;
			case 'e': countOfE++; break;
			case 'i': countOfI++; break;
			case 'o': countOfO++; break;
			case 'u': countOfU++; break;
			}
		}
		
		System.out.println("Count of a is: " + countOfA);
		System.out.println("Count of e is: " + countOfE);
		System.out.println("Count of i is: " + countOfI);
		System.out.println("Count of o is: " + countOfO);
		System.out.println("Count of u is: " + countOfU);

	}

}
