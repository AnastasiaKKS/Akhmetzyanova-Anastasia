public class Task17 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321)); // true
        System.out.println(isPalindrome(12345)); // false
        System.out.println(isPalindrome(0));     // true
        System.out.println(isPalindrome(7));     // true
    }

    static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }
}