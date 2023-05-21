import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime no or not: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		if(num>1) {
			for(int i=1; i<=num; i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("Prime number");
			}else {
				System.out.println("Not prime number");
			}
		}
	}

}
