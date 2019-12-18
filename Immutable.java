package com.singletone.in;
/* 
 * The class muThe class must be declared as final (So that child classes can’t be created)
 
 *Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
 
 *A parameterized constructor
 
 *Getter method for all the variables in it
 
 *No setters(To not have the option to change the value of the instance variable)


*/
public final class Immutable {
	
	final int id;
	final String name;
	public int getId() {
		return id;
	}
		public String getName() {
		return name;
	}
		public Immutable(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
	public static void main(String[] args) {
		Immutable i1=new Immutable(10, "java");
		System.out.println(i1.getId());
		System.out.println(i1.getName());
		//after reassignment to id or name field give error
		//i1.id=20;
		
		
	}
	
	

}
