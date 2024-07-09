package com.sriindu.finaldemo;

public class Finaldemo {
	final int x=10;
	
	static final int y;
	//final
	final static void change() {
		System.out.println("default");
	}
	static {
		y=30;
	}

}
