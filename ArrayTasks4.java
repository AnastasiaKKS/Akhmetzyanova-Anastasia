public class ArrayTasks4 {
    public static void main(String[] args) {
        //задание 4. Кол-во чет.чисел
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count = count + 1;
            }
        }

        System.out.println("Четных чисел: " + count);
    }
}