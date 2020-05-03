package dynamicprogramming;

import java.util.List;

/*
 *Given an array of integers, A of length N, find the length of longest subsequence which is first 
 *increasing then decreasing.
 */

public class LengthOfLongestSubsequence {
	public int longestSubsequenceLength(final List<Integer> A) {
        int n=A.size();
        int lis[]=new int[n];
        int lds[]=new int[n];
        for(int i=0;i<n;i++){
            lis[i]=1;
            lds[i]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(A.get(i)>A.get(j) && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
            }
        }
        for(int i=n-2;i>=0;i--){
            for(int j=n-1;j>=i;j--){
                if(A.get(i)>A.get(j) && lds[i]<lds[j]+1){
                    lds[i]=lds[j]+1;
                }
            }
        }
        int max=lis[0]+lds[0]-1;
        for(int i=1;i<n;i++){
            if(lis[i]+lds[i]-1>max){
                max=lis[i]+lds[i]-1;
            }
        }
        return max;
    }
}
