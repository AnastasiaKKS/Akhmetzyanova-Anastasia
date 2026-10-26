import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //задача 4. побег из башни

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countWays(n, false));
    }

    static int countWays(int rem, boolean prevWasTwo) {
        if (rem == 0) return 1;
        if (rem < 0) return 0;

        int result = countWays(rem - 1, false);

        if (!prevWasTwo) {
            result = result + countWays(rem - 2, true);
        }

        return result;
    }
}