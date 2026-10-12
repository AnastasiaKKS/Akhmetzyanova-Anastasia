import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int command;

        do {
            System.out.println("Меню:");
            System.out.println("1. Поздороваться");
            System.out.println("2. Показать случайное число");
            System.out.println("0. Выйти");
            System.out.print("Ваш выбор: ");

            command = sc.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Привет!");
                    break;
                case 2:
                    int number = (int) (Math.random() * 100);
                    System.out.println("Случайное число: " + number);
                    break;
                case 0:
                    System.out.println("Пока!");
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        } while (command != 0);
    }
}