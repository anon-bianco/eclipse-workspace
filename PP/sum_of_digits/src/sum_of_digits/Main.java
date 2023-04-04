package sum_of_digits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, rev, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value: ");
		n = sc.nextInt();
		
		while(n!=0) {
			rev = n%10;
			sum = sum + rev;
			n = n/10;
		}
		System.out.println(sum);
		

	}

}
