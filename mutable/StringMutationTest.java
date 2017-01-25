package mutable;

public class StringMutationTest {
	public static void main(String[] args) {
		testStringMutation();
	}

	private static void testStringMutation() {
		String[] laptops = { "Lenovo", "HP", "Samsung", "DELL" };
		mutateArray(laptops);
		for (String l : laptops) {
			System.out.println(l);
		}
	}

	public static void mutateArray(String[] laptops) {
		for (int index = 0; index < laptops.length; index++) {
			laptops[index] = laptops[index] + " " + "Champ";
		}
	}

}
