package com.java.prtc;

import java.util.HashMap;

public class TestSample {
	public static void main(String[] args) {
		m1();
		primeNumber(1);
	}
	
	public static void primeNumber(int n) {

		int count=0;
		if(n>1) {
	for(int i=1;i<=n;i++) {
		if(n%i==0)
			count++;
	}
	if(count==2) {
		System.out.println("prime number");
	}else {
		System.out.println("not a prime number");
	}
		}else {
			System.out.println("Not a prime number");
		}
	}
	public static void m1() {
		String s="ajay varm javvaji javvaji";
			String[] str=s.split(" ");
			
			
			System.out.println(str.length);
			
			
			HashMap<String,Integer> map=new HashMap<>();
			for(String st:str) {
				if(map.containsKey(st)) {
					map.put(st, map.get(st)+1);
				}else {
					map.put(st, 1);
				}
			}
			System.out.println(map);
//		String s="ajay varma javvaji javvaji ajay varma";
////		s=s.replace(" ",""); 
//		String [] c =s.split(" ");
////	     c=s.toCharArray();
//		HashMap<String,Integer> map=new HashMap<>();
//		for(String ch:c) {
//			if(map.containsKey(ch)) {
//				map.put(ch, map.get(ch)+1);
//			}else {
//				map.put(ch, 1);
//			}
//		}
//		System.out.println(map);
	}
}