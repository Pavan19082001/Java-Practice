package com.pavan;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		int Vcount = 0;
		int Ccount = 0;
		String s = "Capgemini";
		s = s.toLowerCase();
		char Vchar = ' ';
		char[] Cchar;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				Vchar = s.charAt(i);
				Vcount++;
			}
			Ccount++;
		}
		System.out.println("Vowels count: "+Vcount);
		System.out.println("Consonants count: "+Ccount);
		System.out.println(Vchar);
	}

}
