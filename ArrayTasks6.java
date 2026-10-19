public class ArrayTasks6 {
    public static void main(String[] args) {
        //задагие 6. Проверка, есть ли число в массиве
        int[] a = {3, 7, 1, 9, 4};
        int target = 9;

        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                found = true;
            }
        }

        if (found == true) {
            System.out.println("Число найдено");
        } else {
            System.out.println("Число не найдено");
        }
    }
}