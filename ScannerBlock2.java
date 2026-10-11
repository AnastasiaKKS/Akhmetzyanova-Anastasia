import java.util.Scanner;

public class ScannerBlock2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		String str = h % 2 == 0 ? "Четное" : "Нечетное";
		System.out.println(str);
	}
}