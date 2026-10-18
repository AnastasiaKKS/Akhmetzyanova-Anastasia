public class Task25 {
    public static void main(String[] args) {
        printUp(5);
    }

    static void printUp(int n) {
        if (n < 1) {
            return;
        }
        printUp(n - 1);
        System.out.println(n); // печатаем ПОСЛЕ рекурсии
    }
}