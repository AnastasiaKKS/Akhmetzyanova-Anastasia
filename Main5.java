import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		//Здача 5. считать строку из англ слов, пробелов, табуляций.
		Scanner scanner = new Scanner(System.in);
		String wordsLine = scanner.nextLine().trim();
        int count = wordsLine.isEmpty() ? 0 : wordsLine.split("\\s+").length;
        System.out.println(count);
	}
}