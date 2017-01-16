package arrays;

public class TextAlphabets {
	public static void main(String[] args) {
		char[] alphabets = getAlphabets();
		for (char a : alphabets) {
			System.out.println(a);
		}
	}

	private static char[] getAlphabets() {
		char[] myAlphabets = { 'A', 'B', 'C', 'D', 'E', 'F' };
		return myAlphabets;

	}
}
