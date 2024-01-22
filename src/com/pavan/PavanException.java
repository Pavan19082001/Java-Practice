package com.pavan;

class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}

public class PavanException {
	public static void main(String[] args) {
		try {
			String s = "Satish";
			if(!s.contains("Pavan")) {
				throw new MyException("Pavan Exception");
			}else {
				System.out.println(s);
			}
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
