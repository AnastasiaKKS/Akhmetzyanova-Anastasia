public class StringTasks6 {
  public static void main(String[] args) {

    String word = "level";
    boolean flag = true;

    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
        flag = false;
        break;
      }
    }

    if (flag) {
      System.out.println("Палиндром");
    } else {
      System.out.println("Не палиндром");
    }

  }
}