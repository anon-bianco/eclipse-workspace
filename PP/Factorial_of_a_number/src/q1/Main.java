package q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a no to find factorial: ");
		int number = sc.nextInt();
		
		int factorial = 1;
		
		for(int i=1; i<=number; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial is " + factorial);
	}	

}
