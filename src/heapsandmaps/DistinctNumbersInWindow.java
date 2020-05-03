package heapsandmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 *You are given an array of N integers, A1, A2 ,…, AN and an integer K. 
 *Return the of count of distinct numbers in all windows of size K.
 *Formally, return an array of size N-K+1 where i’th element in this array contains number 
 *of distinct elements in sequence Ai, Ai+1 ,…, Ai+k-1.
 */

public class DistinctNumbersInWindow {
	public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

		ArrayList<Integer> res=new ArrayList<>();
		if(B>A.size()){
			return res;
		}
		Map<Integer, Integer> hm=new HashMap<>();
		int dCount=0;
		for(int i=0;i<B;i++){
			if(hm.get(A.get(i))==null){
				dCount++;
				hm.put(A.get(i),1);
			}
			else{
				hm.put(A.get(i),hm.get(A.get(i))+1);
			}
		}
		res.add(dCount);
		for(int i=B;i<A.size();i++){
			if(hm.get(A.get(i-B))==1){
				dCount--;
				hm.remove(A.get(i-B));
			}
			else{
				hm.put(A.get(i-B),hm.get(A.get(i-B))+1);
			}

			if(hm.get(A.get(i))==null){
				hm.put(A.get(i),1);
				dCount++;
			}
			else{
				hm.put(A.get(i),hm.get(A.get(i))+1);
			}
			res.add(dCount);
		}
		return res;
	}
}
