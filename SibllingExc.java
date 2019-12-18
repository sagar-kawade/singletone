package com.singletone.in;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class SibllingExc {
	
 
void m1() throws FileNotFoundException  {
	 System.out.println("in parent class");
 }
	
public static void main(String[] args) throws Exception {
	SibllingExc p1=new SibllingExc();
	p1.m1();
	Chaild c1= new Chaild();
	c1.m1();
	
}
}
class Chaild extends SibllingExc
{
	void m1() throws EOFException{        //not allowed siblings
		
		System.out.println("in chaild class");
	}
}





