package sample;


public class Main {

	public static void main(String[] args) {
		
		import java.util.Scanner;
		public class MaxOfAnArray {
			public static void main(String[] args)
			{
				int i;
				int a[]=new int[5];
				int m=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter array values");
				for(i=0;i<5;i++)
				{
					a[i]=sc.nextInt();
				}
				for(i=0;i<5;i++)
				{
					if(m<a[i])
					{
					m=a[i];
					}
					
				}
				System.out.println(m);
			}

		}


	}

}
