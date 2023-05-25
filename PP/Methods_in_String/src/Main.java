
public class Main {

	public static void main(String[] args) {
		
		String s1 = new String("Anon");
		String s2 = new String(" ");
		
		System.out.println(s1.length());
		System.out.println(s2.isBlank());
		System.out.println(s2.isEmpty());
		
		System.out.println("***********equals**************");
		
		String s3 = new String("Anon");
		String s4 = "Anon";
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println("*************Comparision methods**************");
		
		String s5 = "Apple";
		String s6 = "Samsung";
		
		int result = s5.compareTo(s6); //lexicography
		System.out.println(result);
		
		System.out.println("*************Searching methods**************");
		
		String s7 = "hello world";
		
		System.out.println(s7.indexOf('l')); //first occurance of l
		System.out.println(s7.lastIndexOf('l'));//last occurance of l
		System.out.println(s7.indexOf("world")); //first occurance of a String
		System.out.println(s7.indexOf('l', 6));
		
		System.out.println("*************Character extraction methods**************");
		
		String s8 = "hello world";
		
		System.out.println(s8.charAt(6));
		System.out.println(s8.substring(6));
		
	}

}
