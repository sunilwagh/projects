package practice.projects;

public class Exponent {

	public static void main(String[] args) {
		System.out.println(exponent(5, 8));
	}

	private static int exponent(int number, int exp) {

		System.out.println("Number ->"+number+" Exp-> "+exp);
		if (exp == 1) {
			return number;
		} else {
			exp--;
			return number * exponent(number,exp);
		}
	}

}
