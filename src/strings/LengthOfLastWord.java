package strings;

/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return
 * the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 */
public class LengthOfLastWord {
  public int lengthOfLastWord(final String A) {
    String[] tokens = A.split(" ");
    if (tokens.length != 0) {
      return tokens[tokens.length - 1].length();
    } else
      return 0;
  }
}
