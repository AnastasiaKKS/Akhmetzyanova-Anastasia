import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //задача 2. Маршрут курьера. 

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int energy = sc.nextInt();               

        int left = 0;
        int sum = 0;
        int best = 0;

        for (int right = 0; right < n; right++) {
            sum += a[right];                    

            
            while (sum > energy) {
                sum -= a[left];
                left++;
            }

           
            int len = right - left + 1;
            if (len > best) {
                best = len;
            }
        }

        System.out.println(best);
    }
}