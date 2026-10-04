public class StringTasks7 {
  public static void main(String[] args) {

    String text = "Hello World";
    int count = 0;

    String s = text.toLowerCase();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        count++;
      }
    }

    System.out.println(count);

  }
}