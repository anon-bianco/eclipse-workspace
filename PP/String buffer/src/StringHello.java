public class StringHello {

	public static void main(String[] args) {
		
		StringHello sh = new StringHello();
		
		String[] names = {"anon", "joyson", "shafeek", "bravin"};
		
		sh.joinWords(names);
	}
	
	private void joinWords(String[] names) {
		
		StringBuffer sb = new StringBuffer();
		
		for(String name: names) {
			sb.append(name);
		}
		
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}
