package com.java.prtc;

class Parent{
	
	void show() {
		System.out.println("Parent class show() method");
	}
	
	void display() {
		System.out.println("Parent class display() method");
	}
	
}
class Child extends Parent{

void show() {
	System.out.println("Child class show() method");
		
	}
	
void print() {
	System.out.println("child class print() method");
}
}


public class TypeCasting {

	
	public static void main(String[] args) {
		
//		Parent p=new Parent();
//		p.show();
//		Child c=new Child();
//		c.show();
		Parent p1=new Child();
		p1.show();
		
		Parent p2=new Child();
		
		Child c1=(Child) p2 ;
		c1.show();
		
		
	}
}
