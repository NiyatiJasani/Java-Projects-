package com.techlabs.overloading;

public class OverloadingTestDouble {
	public static void main(String[] args) {
	//	add(10.55);
		add(10.55d, 20.55);
		//add(10.55, 10.55, 10.55, 10.55);
		add(10.4f, 9.5f);
	}

	private static void add(double number) {
		double sum = 10.55 + number;
		System.out.println("Overload no 1/4");
		System.out.println("Sum is " + sum);
	}

	private static void add(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("Sum is " + sum);
		System.out.println("Overload no 2/4");
	}

	private static void add(double num1, double num2, double num3, double num4) {
		double sum = num1 + num2 + num3 + num4;
		System.out.println("Sum is " + sum);
		System.out.println("Overload no 3/4");
	}
	private static void add(float num1, float num2){
		float sum = num1 + num2;
		System.out.println("Sum is " + sum);
		System.out.println("Overload no 4/4");
	}
	
}
