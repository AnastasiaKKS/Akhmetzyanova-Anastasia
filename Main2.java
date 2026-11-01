import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		//Задача 2. считать логин длиной от 1 до 30 симв(длина от 3 до 12)
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String login = "[a-z][a-z0-9_]{2,11}";

		System.out.println(s.matches(login) ? "yes" : "no");
	}
}