import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		//Задача 3. считать строку и заменить каждую цифру от 0 до 9 символом #
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String digit = s.replaceAll("\\d", "#");
		System.out.println(digit);
	}
}