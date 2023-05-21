package q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int factorial=1;  
		
		System.out.println("Enter a number to find factorial: ");
		int number= sc.nextInt(); 
		  
		for(i=1;i<=number;i++){    
		  factorial = factorial*i;    
		} 
		  
		 System.out.println("The factorial is " + factorial);

	}

}
