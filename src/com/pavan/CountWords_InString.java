package com.pavan;

import java.util.HashMap;

public class CountWords_InString {
	public static void main(String[] args) {
		String s = "test this one and test this one";
		
		HashMap<String, Integer> hm = new HashMap<>();
		for(String str: s.split(" ")) {
			if(hm.containsKey(str)) {
				int count = hm.get(str);
				hm.put(str, count+1);
			}else {
				hm.put(str, 1);
			}
		}
		System.out.println(hm.entrySet());
	}
}
