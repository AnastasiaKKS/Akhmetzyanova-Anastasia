public class Task27 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 10};
        System.out.println(sumArray(numbers, 0)); // 20
        System.out.println(sumArray(numbers, 1)); // 17
        System.out.println(sumArray(numbers, 2)); // 10
        System.out.println(sumArray(numbers, 3)); // 0 (index == length)
    }

    static int sumArray(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + sumArray(numbers, index + 1); // рекурсивный шаг
    }
}