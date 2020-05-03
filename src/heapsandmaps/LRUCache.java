package heapsandmaps;

import java.util.LinkedHashMap;

/*
 *Design and implement a data structure for LRU (Least Recently Used) cache. 
 *It should support the following operations: get and set.
get(key) - Get the value (will always be positive) of the key if the key exists in the cache, 
otherwise return -1.
set(key, value) - Set or insert the value if the key is not already present. 
When the cache reaches its capacity, it should invalidate the least recently used item 
before inserting the new item.
The LRU Cache will be initialized with an integer corresponding to its capacity. 
Capacity indicates the maximum number of unique keys it can hold at a time.

Definition of “least recently used” : An access to an item is defined as a get or a set
operation of the item. “Least recently used” item is the one with the oldest access time.
 */

public class LRUCache {
	int capacity;
	LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
	public LRUCache(int capacity) {
		this.capacity=capacity;
	}

	public int get(int key) {
		if(hm.containsKey(key)){
			int val=hm.get(key);
			hm.remove(key);
			hm.put(key,val);
			return val;
		}
		return -1;
	}

	public void set(int key, int value) {
		if(!hm.containsKey(key)){
			if(hm.size()==capacity){
				int h=hm.keySet().iterator().next();
				hm.remove(h);
				hm.put(key,value);
			}
			else{
				hm.put(key,value);
			}
		}
	}
}
