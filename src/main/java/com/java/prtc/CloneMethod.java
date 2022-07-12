package com.java.prtc;



public class CloneMethod implements Cloneable {

	int pid;
	int price;
	
	
	void m1() throws CloneNotSupportedException {
		
		CloneMethod obj=new CloneMethod();
		obj.pid=2;
		obj.price=3;
		
		//CloneMethod obj2=(CloneMethod) obj.clone();
		System.out.println(obj.pid+"::"+obj.price);
		
		
	}
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
	
		CloneMethod c=new CloneMethod();
		
		c.m1();
	//	System.out.println(c.pid+"::"+c.price);
		
		Object obj=new CloneMethod();
		obj=c.clone();
		CloneMethod c1=(CloneMethod) obj;
		c.pid=30;
		c.price=40;
//		System.out.println(c.pid+"::"+c.price);
//		System.out.println(c1.pid+"::"+c1.price);
		
	}
	
	
}
