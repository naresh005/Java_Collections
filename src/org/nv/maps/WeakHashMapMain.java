package org.nv.maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class WeakHashMapMain {
	
	public static void main(String[] args){
		
		Map<String, String> map = new WeakHashMap<>();
		
		String key1 = new String("Key1");
		String key2 = new String("Key2");
		map.put(key1, "value1");
		map.put(key2, "value2");
		
		printMap(map);
		
		key1=null;
		
		System.gc();
		
		printMap(map);
		
		
	}
	
	public static void printMap(Map<String, String> map){
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}
