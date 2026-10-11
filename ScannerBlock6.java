import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
        } while (!password.equals("java123"));

        System.out.println("Вход выполнен");
    }
}