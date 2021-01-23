package Recursion;

public class recursionEx {

	public static void main(String[] args) {
		// 1. printig numbers
		// printNum(5);
		// 2. total eyes
		// System.out.println(totEyes(10));
		System.out.println(power(2, 3));
		// System.out.println(factorial(5));
	}

	public static void printNum(int num) {
		if (num == 0) {
			return;
		} else {
			System.out.println(num);
			printNum(num - 1);
		}
	}

	public static int totEyes(int num) {
		if (num == 0) {
			return num;
		} else {
			return 2 + totEyes(num - 1);
		}

	}

	public static int power(int base, int num) {
		if (num == 1) {
			return base;
		} else {
			return base * power(base, num - 1);
		}

	}

	public static int factorial(int num) {
		if (num == 1) {
			return num;
		} else {
			return num * factorial(num - 1);
		}

	}
}
