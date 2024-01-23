package com.pavan;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOccurance {
	public static void main(String[] args) {
		String str = "Programmer";
		
		Map<Character, Integer> freqCharMap = new HashMap<>();
		
		for(char c: (str.toLowerCase()).toCharArray()) {
			if(freqCharMap.containsKey(c)) {
				int count = freqCharMap.get(c);
				freqCharMap.put(c, count+1);
			}else {
				freqCharMap.put(c, 1);
			}
		}
		freqCharMap.forEach((k,v)->System.out.println(k+" occurs "+v+" times"));
	}

}
