package com.java.prtc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
 * 
 * Good morning coding
 * 
 * 
*/



interface Interfa{
	public Test m1(String name,int id,int marks);
}
class Test {
	String name;
	int id;
	int marks;
	Test(String name,int id,int marks){
		name=this.name;
		id=this.id;
		marks=this.marks;
		System.out.println(name+id+marks);
	}
}
public class AppTest {
	public static void main(String[] args) {
		

		ArrayList<Integer> al=new ArrayList<>();
		al.add(78);
		al.add(90);
		al.add(67);
		al.add(34);
		al.add(23);
		System.out.println(al);
		al.stream().forEach((i)->{
			System.out.println("The square"+i*i);
		});
		
		
		
		Integer ls=al.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		Integer ls1=al.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(ls);
		System.out.println(ls1);
	
		
		ArrayList<String> arr=new ArrayList<>();
		arr.add("AJAY");
		arr.add("vijay");
		arr.add("kumar swamy");
		arr.add("pandu nath");
		arr.add("sunil kumar");
		
		
		Comparator<Integer> c1=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:i1.compareTo(i2);
		Comparator<String> c2=(s1,s2)->{
			int a=s1.length();
			int b=s2.length();
			if(a<b)
				return -1;
			else if(a>b)
				return 1;
			else 
				return s1.compareTo(s2);
		};
		
		
		
		List<Integer> list=al.stream().sorted(c1).collect(Collectors.toList());
		List<String> list1=arr.stream().sorted(c2).collect(Collectors.toList());
	    System.out.println(list1);

		//		for(int i=0;i<=10;i++) {
//
//			al.add(i);
//			
//		}
		
		
		
		System.out.println(al);
		List<Integer> al2=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		long count =al.stream().filter(i->i<=35).count();
		List<Integer> al4=al.stream().map(i->i+5).collect(Collectors.toList());

		Collection c=al.stream().sorted().collect(Collectors.toList());
		System.out.println(c);
//		System.out.println(al3);
		System.out.println(al4);
		List<Integer> li=al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(li);
	}		
}