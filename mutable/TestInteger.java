package mutable;

public class TestInteger {
	public static void main(String[] args) {
			testIntMutation();
	}

	private static void testIntMutation() {
		int marks = 100;
		mutationInt(marks);
		System.out.println("Marks after mutation is " + marks);
	}

	private static void mutationInt(int m) {
		m = 0;
		// change the value to o, 
		//not a variable
	}
}
