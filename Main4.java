import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		//задача 4. считать строку. Вывести непрерывные последовательности цифр от 0 до 9 в порядке появления
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
        String numbers = String.join("\n", s.replaceAll("\\D+", " ").trim().split(" +"));
        System.out.println(numbers.isEmpty() ? "NONE" : numbers);

	}
}