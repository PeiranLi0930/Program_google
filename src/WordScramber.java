/**
 * @author Peiran Li
 */
public class WordScramber {
  public static void scrambleLetters(String str, String answer) {
    if (str.length() == 0) {
      System.out.println(answer);
      return;
    } else {
      for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        str = str.substring(0, i) + str.substring(i + 1);
        scrambleLetters(str, answer + c);
        str = str.substring(0, i) + c + str.substring(i);
        answer = answer.substring(0, answer.length());
      }
    }
  }
}
