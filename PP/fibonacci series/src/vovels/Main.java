package vovels;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1; 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of digits to be printed: ");
		int count = sc.nextInt();

		System.out.print(n1 + " " + n2);
		
		for(int i = 3; i<=count; i++) {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
