package javaUtil.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("001", "kang");
		map.put("002", "leeim");
		map.put("003", "kangchoi");
		
		map.put("001", "kim");
		
		System.out.println(map.size());
		System.out.println(map.get("001"));
		
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			
			System.out.printf("key::%s, value::%s \n",key,value);
		}
			
	}
}
