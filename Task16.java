public class Task16 {
	public static void main(String[] args) {

		System.out.println(reverseNumber(12345)); // 54321
        System.out.println(reverseNumber(1000));  // 1
        System.out.println(reverseNumber(7));     // 7
        System.out.println(reverseNumber(0));     // 0
    }

    static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int d = number % 10;
            reversed = reversed * 10 + d;
            number /= 10;
        }
        return reversed;
	}
}