package dynamicprogramming;

/*
 *A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.


 */
public class WaysToDecode {
	public int numDecodings(String A) {
		int n=A.length();
		if(A.charAt(0)=='0')
			return 0;
		int count[]=new int[n+1];
		count[0]=1;
		count[1]=1;
		for(int i=2;i<=n;i++){
			count[i]=0;
			if(A.charAt(i-1)>'0'){
				count[i]=count[i-1];
			}
			if(A.charAt(i-2)=='1' ||(A.charAt(i-2)=='2' && A.charAt(i-1)<'7')){
				count[i]+=count[i-2];
			}
		}
		return count[n];
	}
}
