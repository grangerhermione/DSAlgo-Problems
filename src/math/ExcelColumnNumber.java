package math;

/*
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 */
public class ExcelColumnNumber {
  public int titleToNumber(String A) {
    int result = 0;
    int p = 1;
    int i = A.length() - 1;
    while (i >= 0) {
      result += (int) Math.pow(26, p) * (A.charAt(i) - 'A' + 1);
      p++;
      i--;
    }
    return result;
  }
}
