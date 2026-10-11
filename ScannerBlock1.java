import java.util.Scanner;
/*
public class ScannerBlock1 {
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("Введите возраст : ");
		int age = a.nextInt();

		String result = age >=18 ? "Доступ разрешен" : "Доступ запрещен";
		System.out.println(result);
	}
}
*/
public class ScannerBlock1 {
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("Введите цел число :");
		int number = scanner.nextInt();
		String result = number % 2 ==0 ? "Чет" : "Нечет";

		System.out.println(result);

	}
}