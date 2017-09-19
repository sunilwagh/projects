package practice.projects;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverseNumber(123456));
	}

	private static int reverseNumber(int n) {

		int reverseNumber = 0;

		while (n != 0) {
			int remainder = n % 10; // 6      5
			n = n / 10;             // 12345  1234
			reverseNumber = reverseNumber*10+remainder;
		}
		return reverseNumber;
	

}
}


