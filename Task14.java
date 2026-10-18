public class Task14 {
	public static void main(Strring[] args) {

		System.out.println(digitSum(12345)); // 15
        System.out.println(digitSum(9));     // 9
        System.out.println(digitSum(1000));  // 1
        System.out.println(digitSum(0));     // 0
    }

    static int digitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // последняя цифра
            number /= 10;       // отбрасываем её
        }
        return sum;
    }
}
