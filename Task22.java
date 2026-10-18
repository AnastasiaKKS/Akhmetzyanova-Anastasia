public class Task22 {
    public static void main(String[] args) {
        System.out.println(sumTo(1));  // 1
        System.out.println(sumTo(5));  // 15 (1+2+3+4+5)
        System.out.println(sumTo(10)); // 55
    }

    static int sumTo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumTo(n - 1);     // рекурсивный шаг
    }
}