package com.techlabs.overloading;

public class PrintOverload {
	public static void main(String[] args) {
		print("Howdy");
		print("Howdy", "Niyati");
		// int a= 5;
		print("Howdy", 10);
		print();
		// String xyz = "Minesh";
		// int d = 10;
		// print(xyz, d);
		// print(xyz, "niyati");
	}

	private static void print(String greet) {
		String greetprint = greet;
		System.out.println(greetprint);
	}
	/*
	 * private static void print(String game, String gigi){ String tommy = game
	 * + " " + gigi; System.out.println(tommy); }
	 */

	private static void print(String greetprint, String name) {
		String namecall = greetprint + " " + name;
		System.out.println(namecall);

	}

	private static void print(String greetprint, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(greetprint);
		}
	}

	private static void print() {
		System.out.println("Howdy");
	}
}