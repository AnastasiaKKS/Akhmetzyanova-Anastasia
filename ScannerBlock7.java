import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите балл (0-100): ");
        int score = scanner.nextInt();

        int grade = score >= 90 ? 5
                  : score >= 75 ? 4
                  : score >= 60 ? 3
                  : 2;

        System.out.println("Оценка: " + grade);
    }
}