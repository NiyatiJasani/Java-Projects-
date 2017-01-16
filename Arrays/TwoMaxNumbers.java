package arrays;

import java.util.Arrays;

public class TwoMaxNumbers {

	public static void main(String[] args) {
		int[] num = new int[] { 9, -3, 360, 21, 499 };
		int maxOne=0;
		int maxTwo=0;
		for(int n: num){
			if(maxOne < n){
				maxTwo= maxOne;
				maxOne=n;
			}
		}
		System.out.println("First Max Number: "+ maxOne);
		System.out.println("Second Max Number: "+ maxTwo);
		
		
		
		
		  //TwoMaxNumbers tmn = new TwoMaxNumbers();
		  //tmn.printTwoMaxNumbers(num);
		/*Arrays.sort(numbers);
		 
		  System.out.println("Largest Number: "+numbers[numbers.length-1]);
		  System.out.println("Second Largest Number: "+numbers[numbers.length-2]);*/
	}
}
