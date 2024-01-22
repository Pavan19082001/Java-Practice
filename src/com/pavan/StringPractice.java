package com.pavan;

public class StringPractice {
	public static void main(String[] args) {
		String mailId = "programmer@hotmail.com";
		int i = mailId.indexOf('@');
		String userName = mailId.substring(0, i);
		int j = mailId.indexOf('.');
		String domain = mailId.substring(i+1, j);
		System.out.println("Username-"+userName);
		System.out.println("Domain-"+domain);
		System.out.println(domain.equals("gmail"));
	}

}
