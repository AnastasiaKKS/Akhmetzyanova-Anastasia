public class StringTasks4 {
  public static void main(String[] args) {

    String text = "anastasia";
    int count = 0;

    for (int i = 0; i < text.length(); i++) { /*int i = 0 — начало: создаем счётчик i, начинаем с нуля.

i < text.length() — условие: пока i меньше длины строки — выполняем тело цикла.

i++ — шаг: после каждого круга увеличиваем i на 1.
*/
      if (text.charAt(i) == 'a') {
        count++;
      }
    }

    System.out.println(count);

  }
}