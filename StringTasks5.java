public class StringTasks5 {
  public static void main(String[] args) {

    String text = "   Привет, мир!   ";

    String s = text.trim();//text.trim() — «trim»=«подрезать».Убирает пробелы (и другие невидимые символы) в начале и в конце.

    System.out.println(s);
    System.out.println(s.length());

  }
}