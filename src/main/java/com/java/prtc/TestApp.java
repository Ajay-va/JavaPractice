package com.java.prtc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface Demo{
	public void d1();
	public default void d2() {}
	public static void d3() {}
}

interface Emp1{

	public void m1();
	public void m2();

}

class Emp2 implements Emp1{

	@Override
	public void m1() {

	}

	@Override
	public void m2() {

	}

}

class Employee{

	int eid;
	String name;

	Employee(int eid,String name){
		this.eid=eid;
		this.name=name;

	}

	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}

}

abstract class Emp3{
	public abstract void m3();
	public void m4() {

	}
}

interface Left{
	default void m1() {
		System.out.println("m1() method from Left");
	}
}
interface Right extends Left{
	default  public void m1() {
		System.out.println("m1() method from Right");
		Left.super.m1();
	}
}

class Middle{

	public static void p1() {
		System.out.println("p1() method in Middle class");
	}

	public void p2() {
		System.out.println("p2() method in Middle class");

	}
}

class Student{
	int sid;
	String name;
	int marks;
	Student(int sid,String name,int marks){
		this.sid=sid;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
public class TestApp extends Middle implements Left,Right{
	public static void main(String[] args) {
		

		BiFunction<Integer,String,Employee> bi=(e1,e2)->new Employee(e1,e2);
		System.out.println(bi.apply(890, "heloo"));
		
		
		TestApp ap=new TestApp();
		
		
		Supplier<String> sup=()->{
			String otp1="";
			for(int i=0;i<6;i++) {
			 otp1= otp1+(int)(Math.random()*10);
			}
			return otp1;
		};
		System.out.println(sup.get());
		
		
		Function<Integer,Integer> fi=(i)->10*i;
		Function<Integer,Integer> f1=(i)->i*i;
		 
System.out.println(fi.andThen(f1).apply(10));
		Function<Student,String> f=st->{
			int marks=st.marks;
			String grade="";

			if(marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade="B[First Class]";
			else if(marks>=50) grade="C[Second class";
			else if(marks>=45) grade="D[Third class]";
			else if(marks>25) grade="E[Failed]";
			else grade="Failed";

			return grade;
		};


		Comparator<Student> com=(c1,c2)->(c1.name.compareTo(c2.name));
		




		ArrayList<Student>  stu= new ArrayList<>();
		stu.add(new Student(101,"NAVYA",85));
		stu.add(new Student(102,"AJAY",60));
		stu.add(new Student(103,"VIJAY",50));
		stu.add(new Student(104,"KUTTY",45));
		stu.add(new Student(105,"VARMA",25));

		
			Collections.sort(stu,com);

			System.out.println(stu);
	

			Consumer<Student> consu=student->{
				System.out.println("Student Name:"+student.name);
				System.out.println("Student Id:"+student.sid);
				System.out.println("Student Marks:"+student.marks);
				System.out.println("Student Grade:"+f.apply(student));
				System.out.println("");

			};

			for(Student s:stu) {
				consu.accept(s);
			}
			
			
				
			}






	}
