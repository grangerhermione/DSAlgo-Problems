package strings;

import java.math.BigInteger;

/*
 *Compare two version numbers version1 and version2.
 *If version1 > version2 return 1,
 *If version1 < version2 return -1,
 *otherwise return 0.
 *You may assume that the version strings are non-empty and contain only digits and the . character.
 *The . character does not represent a decimal point and is used to separate number sequences.
 *For instance, 2.5 is not "two and a half" or "half way to version three", 
 *it is the fifth second-level revision of the second first-level revision.
 */
public class CompareVersionNumbers {
	public int compareVersion(String A, String B) {
		String[] tokenA = A.split("\\.");
		String[] tokenB = B.split("\\.");
		int i = 0, j = 0;
		while (i < tokenA.length && j < tokenB.length) {
			if (new BigInteger(tokenA[i]).compareTo(new BigInteger(tokenB[j])) == 1) {
				return 1;
			} else if (new BigInteger(tokenA[i]).compareTo(new BigInteger(tokenB[j])) == -1) {
				return -1;
			} else {
				i++;
				j++;
			}
		}
		if (i < tokenA.length) {
			return 1;
		}
		if (j < tokenB.length) {
			return -1;
		}
		return 0;
	}
}
