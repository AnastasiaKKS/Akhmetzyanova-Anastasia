public class Task24 {
    public static void main(String[] args) {
        printDown(5);
    }

    static void printDown(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printDown(n - 1);      // рекурсивный шаг
    }
}