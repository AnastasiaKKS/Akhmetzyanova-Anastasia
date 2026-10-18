public class Task11 {
	public static void main(String[] args) {
		//Возведение в степень 

		System.out.println(power(2,3));
		System.out.println(power(5,0));
		System.out.println(power(3,4));
		System.out.println(power(10,1));

	}

	static long power(int base, int exponent) {
		long result = 1;
		for (int i = 0; i < exponent; i++) {

			result *= base;
		}
		return result;

	}
}