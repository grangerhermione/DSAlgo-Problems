package strings;

/*
 * Given an input string, reverse the string word by word.
 */
public class ReverseTheString {
  public String reverseWords(String a) {
    String tokens[] = a.split(" ");
    StringBuilder str = new StringBuilder();
    for (int i = tokens.length - 1; i >= 0; i--) {
      str.append(tokens[i] + " ");
    }
    return str.toString().trim();
  }
}
