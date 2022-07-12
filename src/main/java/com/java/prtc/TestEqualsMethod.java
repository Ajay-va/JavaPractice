package com.java.prtc;

public class TestEqualsMethod {	
	int a=97;
	double b=200;
	char ch='c';
	void m1() {
		
		//double b=a;
		//int a=(int) b;
		char c=(char) a;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		TestEqualsMethod t=new TestEqualsMethod();
		t.m1();
		String s1=new String("hello");
		String s2=new String("hello");
		//System.out.println(s1.equals(s2));	

		Product p1=new Product(20,90);
		Product p2=new Product(20,90);
		Product p3=new Product("ajay","javvaji");
		Product p4=new Product("ajay","javvaji");
		//System.out.println(p3.equals(p4));
		

	}
}
class Product{	
	int pid;
	int price;	

	String name;
	String surname;
	Product(int pid,int price){
		this.pid=pid;
		this.price=price;	
	}	
	Product(String name,String surname){
		this.name=name;
		this.surname=surname;
	}
	public boolean equals(Object obj) {

		String sname=this.name;
		String ssurname=this.surname;
		Product pro=(Product)obj;
				
		String sname1=pro.name;
		String ssurname1=pro.surname;
	    if(sname==sname1&&ssurname==ssurname1) {
	    	return true; 
	    	}
	    else {
	    	return false; 
	    	}
	}
}