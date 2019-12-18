package com.singletone.in;

public class SingletoneTest {

	
	public static void main(String[] args) {
		System.out.println("in main method");
		Singletone tone2=Singletone.myobj();
		Singletone tone3=Singletone.myobj();
		System.out.println(tone2.s1);
		System.out.println();
		tone3.m1();
	}
}

class Singletone{
	static Singletone tone1=new Singletone(); 
	//early initalization
	
	String  s1;
	private Singletone(){
		s1="mysinlgetone";
		
				
	}
	static void m1(){
		System.out.println("in singletone method m1");
	}
	public static Singletone myobj(){
		/*if(null==Singletone1){
			Singletone1=new Singletone();
		}*/
		//load initalization
		return tone1;
		
	}
}
