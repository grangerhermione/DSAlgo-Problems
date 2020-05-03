package strings;
/*
 *Given a string A representating json object. Return an array of string denoting json object with proper indentaion.

Rules for proper indentaion:

Every inner brace should increase one indentation to the following lines.
Every close brace should decrease one indentation to the same line and the following lines.
The indents can be increased with an additional ‘\t’
Note:

[] and {} are only acceptable braces in this case.

Assume for this problem that space characters can be done away with.
 */

import java.util.ArrayList;

public class PrettyJson {
	public ArrayList<String> prettyJSON(String A) {
		ArrayList<String> res = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int n = A.length();
		int index = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			char ch = A.charAt(i);
			if (ch == '{' || ch == '[') {
				if (index != 0 && A.charAt(i - 1) != '{' && A.charAt(i - 1) != '[') {
					sb.insert(index++, '\n');
					for (int j = 0; j < count; j++) {
						sb.insert(index++, '\t');
					}
				}
				sb.insert(index++, ch);
				sb.insert(index++, '\n');
				count++;
				for (int j = 0; j < count; j++) {
					sb.insert(index++, '\t');
				}
			} else if (ch == '}' || ch == ']') {
				sb.insert(index++, '\n');
				count--;
				for (int j = 0; j < count; j++) {
					sb.insert(index++, '\t');
				}
				sb.insert(index++, ch);

				// for(int j=0;j<count;j++){
				// sb.insert(index++,'\t');
				// }

			} else if (ch == ',') {
				sb.insert(index++, ch);
				if (A.charAt(i + 1) != '{' && A.charAt(i + 1) != '[') {
					sb.insert(index++, '\n');
					for (int j = 0; j < count; j++) {
						sb.insert(index++, '\t');
					}
				}
			} else {
				sb.insert(index++, ch);
			}
		}
		String[] tokens = sb.toString().split("\n");
		for (int i = 0; i < tokens.length; i++) {
			res.add(tokens[i]);
		}
		return res;
	}
}
