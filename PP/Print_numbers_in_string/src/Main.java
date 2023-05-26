
public class Main {

	public static void main(String[] args) {
		
		String a = "Chennai 600100";
		
		String b = a.toLowerCase();
		System.out.println(b);
		
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)>='d') {
				System.out.print(a.charAt(i));
			}
		}

	}

}
