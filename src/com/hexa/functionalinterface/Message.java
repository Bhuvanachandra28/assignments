package com.hexa.functionalinterface;

public class Message {
	public static void main(String []args) {
		Messages m=() -> System.out.println("succesfully executed functional interface");
		m.quotation();
	}

}
