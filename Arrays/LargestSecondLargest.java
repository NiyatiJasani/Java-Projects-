package arrays;

public class LargestSecondLargest{
	public static void main(String[] args) {
		int[] numbers = { 9, -3, 360, 21, 499 };
		// We will store the first element in the array in the largest variable
		// Every other number is compared with the max number , if greater than
		// max then it is swapped with maxvalue.
		int largest = numbers[0];
		int secondlargest=numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			else if(numbers[i]<secondlargest){
				secondlargest=numbers[i];
			}	

		}
		System.out.println("Largest is " + largest); 
		System.out.println("Smallest is " + secondlargest);
	}
}
/*
 * int[] values = { -8897, 52, 99, 106, 55, 7 };
 * 
 * int maximum = Integer.MIN_VALUE; 
 * int secondmaximum = Integer.MAX_VALUE;
 * 
 * for (int num : values) { if (num > maximum) { secondmaximum = maximum;
 * maximum = num; } else if (num > secondmaximum) { secondmaximum = num; } }
 * System.out.println("Largest is " + maximum); System.out.println(
 * "Smallest is " + secondmaximum);
 */
