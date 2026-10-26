import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //задача 1. Поврежденное заклинание(палидром)
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int l = 0;
        int r = s.length() - 1;   

       
        while (l < r && s.charAt(l) == s.charAt(r)) {
            l++; 
            r--; 
        }

        if (l >= r) {
            System.out.println("YES");
            return;                        
        }


        if (isPal(s, l + 1, r) || isPal(s, l, r - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isPal(String s, int from, int to) {
        while (from < to) {
            if (s.charAt(from) != s.charAt(to)) {
                return false;               
            }
            from++;
            to--;
        }
        return true;                      
    }
}