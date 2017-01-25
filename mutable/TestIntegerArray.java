package mutable;

public class TestIntegerArray {
	public static void main(String[] args) {
		testIntegerArrayMutation();
	}

	private static void testIntegerArrayMutation() {
		int[] salaries = { 10, 20, 30, 40, 50 };
		mutateIntArray(salaries);
		for (int s : salaries) {
			System.out.println(s);
		}
	}

	private static void mutateIntArray(int[] s) {
		for (int i = 0; i < s.length; i++){
			s[i] = 0;
			}
		}

}
