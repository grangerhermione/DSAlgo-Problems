package strings;

/*
 *The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
 *(you may want to display this pattern in a fixed font for better legibility)

P.......A........H.......N
..A..P....L....S....I...I....G
....Y.........I........R
And then read line by line: PAHNAPLSIIGYIR
Write the code that will take a string and make this conversion given a number of rows:

*/

public class ZigzagString {
	public String convert(String A, int B) {
		String[] list = new String[B];
		int n = A.length();
		boolean down = true;
		int index = 0;
		for (int i = 0; i < n; i++) {
			char ch = A.charAt(i);
			if (list[index] == "" || list[index] == null) {
				list[index] = String.valueOf(ch);
			} else {
				list[index] = list[index] + ch;
			}
			if (index == B - 1) {
				down = false;
			} else if (index == 0) {
				down = true;
			}
			if (down) {
				index++;
			} else {
				index--;
			}
		}
		StringBuilder builder = new StringBuilder(n);
		for (String str : list) {
			builder.append(str);
		}
		return builder.toString();

	}
}
