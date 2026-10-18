public class Task26 {
    public static void main(String[] args) {
        System.out.println(fibonacci(0)); // 0
        System.out.println(fibonacci(1)); // 1
        System.out.println(fibonacci(2)); // 1
        System.out.println(fibonacci(5)); // 5
        System.out.println(fibonacci(10)); // 55
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // рекурсивный шаг
    }
}