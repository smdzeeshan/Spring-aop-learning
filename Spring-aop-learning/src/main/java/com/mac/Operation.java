package com.mac;

public class Operation {

	public void msg() {
		System.out.println("msg method invoked");
	}

	public int m() {
		System.out.println("m method invoked");
		return 2;
	}

	public int k() {
		System.out.println("k method invoked");
		return 3;
	}
	
	public void validate(int age) throws Exception {
		if (age<18)
			throw new ArithmeticException("not a valid age..");
		else
			System.out.println("Thanks for the vote");
	}
	
}
