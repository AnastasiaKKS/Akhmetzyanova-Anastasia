public class Task18 {
    public static void main(String[] args) {
        printTable(3);
        System.out.println();
        printTable(5);
    }

    static void printTable(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}