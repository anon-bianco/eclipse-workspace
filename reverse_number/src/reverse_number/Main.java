package reverse_number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, rev;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value to be reversed: ");
		
		n = sc.nextInt();
		while(n!=0) {
			rev = n%10;
			System.out.print(rev);
			n = n/10;
		}
	}

}
