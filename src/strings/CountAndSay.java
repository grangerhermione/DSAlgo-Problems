package strings;

/*
 * The count-and-say sequence is the sequence of integers beginning as follows: 1 is read off as one
 * 1 or 11. 11 is read off as two 1s or 21.
 * 
 * 21 is read off as one 2, then one 1 or 1211.
 * 
 * Given an integer n, generate the nth sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 */
public class CountAndSay {
  public String countAndSay(int A) {
    if (A == 1) {
      return "1";
    }
    if (A == 2) {
      return "11";
    }
    return strRec("21", 3, A);
  }

  private String strRec(String str, int count, int A) {
    if (count == A) {
      return str;
    }
    int streak = 0;

    StringBuilder st = new StringBuilder();
    for (int i = 0; i < str.length();) {
      char first = str.charAt(i);
      while (str.charAt(i) == first) {
        streak++;
        i++;
      }
      st.append(String.valueOf(streak) + String.valueOf(first));
      if (i < str.length()) {
        streak = 0;
      }
    }
    return strRec(st.toString(), count + 1, A);
  }
}
