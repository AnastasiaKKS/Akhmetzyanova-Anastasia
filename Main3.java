import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //задача 3. Энергия для спасательного робота.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = 1_000_000;
        }
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            
            if (i >= 1) {
                dp[i] = Math.min(dp[i], dp[i - 1] + 1);
            }
            
            if (i >= 4) {
                dp[i] = Math.min(dp[i], dp[i - 4] + 1);
            }
            
            if (i >= 6) {
                dp[i] = Math.min(dp[i], dp[i - 6] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}