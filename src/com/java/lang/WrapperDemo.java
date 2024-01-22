package com.java.lang;

public class WrapperDemo {
	public static void main(String[] args) {
		// Boxing
		int a = 10;
		Integer i = Integer.valueOf(a);
		Byte b = Byte.valueOf("12");
		Boolean boo = Boolean.valueOf(false);
		System.out.println(i + " " + b);
		System.out.println(boo);

		Float f = Float.valueOf(25.98f);
		// AutoUnboxing
		float ffloat = f.floatValue();
		System.out.println(ffloat);

		System.out.println(Integer.toOctalString(20));

		Float flo = (float) Math.sqrt(-1);
		System.out.println(flo);
	}

}
