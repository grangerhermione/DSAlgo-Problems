package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 *Find the largest continuous sequence in a array which sums to zero.
 */
public class LargestContinuousSequenceZeroSum {
	public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        int sum=0;
        int ml=0;
        Map<Integer, Integer> hm=new HashMap<>();
        int endIndex=-1;
        for(int i=0;i<A.size();i++){
            sum+=A.get(i);
            if(A.get(i)==0 && ml==0){
                ml=1;
            }
            if(sum==0){
                ml=i+1;
                endIndex=i;
            }
            Integer prev=hm.get(sum);
            if(prev!=null){
                if(ml<i-prev){
                    endIndex=i;
                    ml=i-prev;
                }
            }
            else{
                hm.put(sum,i);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        if(endIndex==-1){
            return res;
        }
        for(int i=endIndex-ml+1;i<=endIndex;i++){
            res.add(A.get(i));
        }
        return res;
    }
}
