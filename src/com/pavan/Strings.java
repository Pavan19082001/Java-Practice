package com.pavan;

public class Strings {
	public static void main(String[] args) {
		String s = "programmer";
		
		char[] String = s.toCharArray();
		
		int[] freq = new int[s.length()];
		
		for(int i=0; i<String.length; i++) {
			freq[i] = 1;
			for(int j=i+1; j<String.length; j++) {
				if(String[i] == String[j]) {
					freq[i]++;
					String[j] = '0';
				}
			}
		}
		
		for(int k=0; k<freq.length; k++) {
			if(String[k] != ' ' && String[k] != '0') {
				System.out.println(String[k]+" - "+freq[k]);
			}
		}
		
	}

}
