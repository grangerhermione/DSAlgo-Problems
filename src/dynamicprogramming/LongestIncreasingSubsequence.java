package dynamicprogramming;

import java.util.List;

/*
 *Find the longest increasing subsequence of a given array of integers, A.

In other words, find a subsequence of array in which the subsequence’s elements are in strictly increasing order, and in which the subsequence is as long as possible. 
This subsequence is not necessarily contiguous, or unique.
In this case, we only care about the length of the longest increasing subsequence.
 */

public class LongestIncreasingSubsequence {
	public int lis(final List<Integer> A) {
        int n=A.size();
        int lis[]=new int[n];
        int max=1;
        lis[0]=1;
        for(int i=1;i<n;i++){
            lis[i]=1;
            for(int j=0;j<i;j++){
                if(A.get(i)>A.get(j) && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                    if(lis[i]>max){
                        max=lis[i];
                    }
                }
            }
        }
        return max;
    }
}
