package newbasics;

public class NumberRange {
	int range;

	public NumberRange(int range) {
		this.range = range;
	}

	public void printEven() {
		for (int i = 1; i <= range; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public void printOdd() {
		for (int y = 1; y <= range; y++) {
			if (y % 2 != 0) {
				System.out.println(y);
			}
		}
	}

	public void printSumOf() {
		int i, sum = 0;
		for (i = 1; i < range; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
