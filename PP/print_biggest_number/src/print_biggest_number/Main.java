package print_biggest_number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		int m = 0;
		int i;
		
		for(i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(i=0; i<a.length; i++) {
			if(a[i]>m) {
				m = a[i];
			}
		}
		
	}

}
