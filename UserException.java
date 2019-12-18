package com.singletone.in;

public class UserException extends Exception {

	public UserException(String s){
		super(s);
	}
	public static void main(String[] args) {
		try {
			throw new UserException("my excetion");
			
		} catch (UserException e) {
			System.out.println("find");
			System.out.println(e.getMessage());
		}
	}
}
