package arrays;

public class StringTestArray {
	public static void main(String[] args) {
		// declare an array of Strings
		// String[]CakeStringArray = new String[]{"Orange", "Apple", "Mango"};
		String[] CakeStringArray = new String[3];
		// assigning values
		CakeStringArray[0] = "Chocloate";
		CakeStringArray[1] = "BlackForest";
		CakeStringArray[2] = "Pineapple";
		for (String Cakes : CakeStringArray) {
			 
			System.out.println("My favourite cake is :" + Cakes);
		}
	}
}
//System.out.println((CakeStringArray[1]));
			// iterating the String Array using a loop
			// for (int i = 0; i < CakeStringArray.length; i++)