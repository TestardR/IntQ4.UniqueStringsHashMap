public class App {
	public static void main(String[] args) {
				System.out.println(count("A"));
	}

	static HasMap<String, Integer> hm = new HasMap<String, Integer>();
	static int count = 0;

	public static int count(String myLetter){
			if(hm.get(myLetter) == null){
				hm.put(myLetter, 1);
				count = 1;
			} else {
				count ++;
				hm.put(myLetter, count);
			}
			retun hm.get(myLetter):
	}
}