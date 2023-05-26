import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String a="race";
		String b="acer";
		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
	    Arrays.sort(c);
	    Arrays.sort(d);
	    String e=String.copyValueOf(c);
	    String f=String.copyValueOf(d);
	  
	 

	    if(e.equals(f))
	    {
	    	System.out.println("anagram");
	    }
	    else
	    {
	    	System.out.println("not a anagram");
		}


	}

}
