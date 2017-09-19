package practice.projects;

/**
 * 
 * For a given integer find the sum of all integers
 *
 */

public class AddNumbers {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(123456));
	}

	private static int sumOfDigits(int n) {

		int sumOfNumber = 0;

		while (n != 0) {
			int remainder = n % 10;
			n = n / 10;
			sumOfNumber += remainder;
		}
		return sumOfNumber;
	}

}
