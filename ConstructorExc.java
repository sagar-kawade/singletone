package com.singletone.in;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ConstructorExc {
int id ;
String name;
public ConstructorExc(int id, String name)throws FileNotFoundException {
	super();
	this.id = id;
	this.name = name;
	
}

}

class A extends ConstructorExc{

	public A(int id, String name) throws IOException  {
		super(id, name);
	}
	
}