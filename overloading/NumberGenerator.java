package com.techlabs.overloading;


public class NumberGenerator {
	public static void main(String[] args) {
		// printsumof(10);
		 printmutltiplesof(9);
		 //printeven(10);
		 //printodd(45);
		//printoddnumrange(60, 120);
	}

	private static void printsumof(int numbers) {
		int i, sum = 0;
		for (i = 1; i <= numbers; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	private static void printmutltiplesof(int num) {
		int count = 10;
		// int number,count;
		for (int i = 1; i <= count; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

	private static void printeven(int num) {
		int count = 100;
		for (int i = 1; i <= count; i++) {
			if (i % 2 == 0) {
				System.out.println("Even numbers uptil 100: " + i);
			}
		}
	}

	private static void printodd(int num) {
		int count = num;
		for (int o = 1; o <= count; o++) {
			if (o % 2 != 0) {
				System.out.println(o);
			}
		}
	}

	private static void printoddnumrange(int num1, int num2) {
		for (int h = num1; h <= num2; h++) {
			if (h % 2 != 0) {
				System.out.println(h); //h%2
			}
		}
	}
}
