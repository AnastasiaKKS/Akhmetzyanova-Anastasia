import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		//Задача 1. Считать строку
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
	    String regex = "[A-Z]{2}-[0-9]{3}";

	    System.out.println(s.matches(regex) ? "yes" : "no");

	}
}