package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *Given an array of strings, return all groups of strings that are anagrams. 
 *Represent a group by a list of integers representing the index in the original list. 
 *Look at the sample case for clarification.
 */
public class Anagrams {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        Map<String, ArrayList<Integer>> hm=new HashMap<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            char temp[]=A.get(i).toCharArray();
            Arrays.sort(temp);
            String t=String.valueOf(temp);
            if(hm.get(t)==null){
                ArrayList<Integer> arr=new ArrayList<>();
                arr.add(i+1);
                hm.put(t,arr);
            }
            else{
                hm.get(t).add(i+1);
            }
        }
        for(ArrayList<Integer> temp:hm.values()){
            res.add(temp);
        }
        return res;
    }
}
