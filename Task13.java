public class Task13 {
    public static void main(String[] args) {

        System.out.println(lcm(12, 18)); // 36
        System.out.println(lcm(4, 6));   // 12
        System.out.println(lcm(7, 5));   // 35
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    static long lcm(int a, int b) {
        return (long) a * b / gcd(a, b);
    }
}