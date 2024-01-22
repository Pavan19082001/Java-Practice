package com.pavan;

import java.util.HashMap;

public class Stack_Example {
	public static void main(String[] args) {
		String s = "Capgemini";
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char ch: s.toLowerCase().toCharArray()) {
			if(hm.containsKey(ch)) {
				int count = hm.get(ch);
				hm.put(ch, count+1);
			}else {
				hm.put(ch, 1);
			}
		}
		
		System.out.println(hm.entrySet());
		
	}
}
