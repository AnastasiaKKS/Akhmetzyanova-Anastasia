public class ArrayTasks5 {
    public static void main(String[] args) {
        //задание 5. Замена отриц.чисел на 0
        int[] a = {3, -1, 5, -7, 0, -2, 8};

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}