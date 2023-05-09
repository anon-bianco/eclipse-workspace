import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("anon");
		list.add("bianco");
		list.add("hello");
		
		System.out.println(list);
		
		for(String a:list) {
			System.out.println(a);
		}
		

	}

}
