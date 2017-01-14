 package com.techlabs.overloading;

public class OverloadingTestIntegers {
	public static void main(String[] args) {
		add(10);
		add(10, 20);
		add(10, 20, 30);
	
	}

	private static void add(int number) {
		int sum = 100 + number;
		System.out.println(("Sum is " + sum));
		// System.out.println("Overloadi number 1");
	}

	private static void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum is " + sum);
	}

	private static void add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Sum is " + sum);
	}
}
