package armstrong_number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, rev, temp, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		
		temp = n;
		
		while(n!=0) {
			rev = n%10;
			sum = sum + (rev*rev*rev);
			n= n/10;
		}
		
		if(sum==temp) {
			System.out.println("Armstrong number.");
		}
		else {
			System.out.println("Not Armstrong number.");
		}
	}

}
