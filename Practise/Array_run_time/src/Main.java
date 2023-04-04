import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		System.out.println("Enter the values to be inserted: ");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Output: ");
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
