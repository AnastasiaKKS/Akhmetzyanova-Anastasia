public class ArrayTasks7 {
    public static void main(String[] args) {
        //задание 7. Развернуть массив
        int[] a = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < a.length / 2; i++) {
            int b = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = b;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}