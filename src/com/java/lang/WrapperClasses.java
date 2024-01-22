package com.java.lang;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(12);
		list.add(15.6f);
		list.add(-2);
		list.add(85.432332d);
		for(Object o: list) {
			if(o instanceof Integer) {
				System.out.println(o+" is Integer");
			}
			if(o instanceof Float) {
				System.out.println(o+" is Float");
			}
			if(o instanceof Double) {
				System.out.println(o+" is Double");
			}
		}
	}

}
