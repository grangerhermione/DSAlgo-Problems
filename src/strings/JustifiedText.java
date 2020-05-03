package strings;

import java.util.ArrayList;

/*
 *Given an array of words and a length L, format the text such that each line has exactly L 
 *characters and is fully (left and right) justified.You should pack your words in a greedy approach; 
 *that is, pack as many words as you can in each line.
 *Pad extra spaces ‘ ‘ when necessary so that each line has exactly L characters.
 *Extra spaces between words should be distributed as evenly as possible.
 *If the number of spaces on a line do not divide evenly between words, 
 *the empty slots on the left will be assigned more spaces than the slots on the right.
 *For the last line of text, it should be left justified and no extra space is inserted between words.
 *Your program should return a list of strings, where each string represents a single line.

 */
public class JustifiedText {
	public ArrayList<String> fullJustify(ArrayList<String> A, int B) {
		int n = A.size();
		ArrayList<String> res = new ArrayList<>();
		int strLen = 0;
		int prevLen = 0;
		ArrayList<String> temp = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String str = A.get(i);
			// if(str.equals("")){
			// continue;
			// }
			strLen += str.length();
			if (strLen > B) {
				int diff = B - prevLen;
				int k = 0;
				for (int j = 0; j < diff; j++) {
					if (k == (temp.size() - 1) && temp.size() == 1) {
						k = 0;
						temp.set(k, temp.get(k) + " ");
					} else if (k == (temp.size() - 1)) {
						k = 0;
						j--;
					} else {
						temp.set(k, temp.get(k) + " ");
						k++;
					}
				}
				strLen = str.length();
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < temp.size(); j++) {
					if (j < temp.size() - 1) {
						sb.append(temp.get(j) + " ");
					} else {
						sb.append(temp.get(j));
					}
				}
				res.add(sb.toString());
				temp.clear();
			}
			temp.add(str);
			prevLen = strLen;
			strLen += 1;

		}
		int len = 0;
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < temp.size(); j++) {
			if (j < temp.size() - 1) {
				String s = temp.get(j) + " ";
				sb.append(s);
				len += s.length();
			} else {
				sb.append(temp.get(j));
				len += temp.get(j).length();
				int diff = B - len;
				for (int k = 0; k < diff; k++) {
					sb.append(" ");
				}
			}
		}

		if (sb.toString() != null && !sb.toString().equals("")) {
			res.add(sb.toString());
		}
		return res;
	}
}
