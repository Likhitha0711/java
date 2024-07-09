package com.sriindu.staticexample;

public class Student {
	int rollno;
	String name;
	
	static String college="sriindu";
	static void change() {
		college="vit";
	
		
	}
	Student (int r,String n){
		rollno=r;
		name=n;
		
		
	}
void display() {
	System.out.println(rollno+" "+name+" "+college);
	
}

}
