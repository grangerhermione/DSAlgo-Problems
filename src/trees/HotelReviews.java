package trees;
/*
 *Given a set of reviews provided by the customers for different hotels and a string containing 
 *“Good Words”, you need to sort the reviews in descending order according to their 
 *“Goodness Value” (Higher goodness value first). We define the “Goodness Value” of a 
 *string as the number of “Good Words” in that string.

Note: Sorting should be stable. If review i and review j have the same “Goodness Value” 
then their original order would be preserved.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HotelReviews {
	public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        Set<String> goodWords=new HashSet<>();
        String[] tokens=A.split("_");
        for(String s: tokens){
            goodWords.add(s);
        }
        List<Hotel> list=new ArrayList<>();
        int index=0;
        for(String str: B){
            int count=0;
            String tok[]=str.split("_");
            for(String t:tok){
                if(goodWords.contains(t)){
                    count++;
                }
            }
            
            list.add(new Hotel(index,count));
            index++;
        }
        Collections.sort(list);
        ArrayList<Integer> res=new ArrayList<>();
        for(Hotel h: list){
            res.add(h.getHotelId());
        }
        return res;
    }
}

class Hotel implements Comparable<Hotel>{
    int hotelId;
    int count;
    
    public Hotel(){
        
    }
    
    public Hotel(int hotelId, int count){
        this.hotelId=hotelId;
        this.count=count;
    }
    
    public int getHotelId(){
        return hotelId;
    }
    
    @Override
    public int compareTo(Hotel other){
        return 2 * Integer.compare(other.count, this.count)
        + Integer.compare(this.hotelId, other.hotelId);
        
    }
}
