package com.crm;




public class User {

	// constructor
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	// parameters constructor
	public User(String name, int age) {
		
	}
	
	// attribute
	private int age;
	
	// getter method
	public int getAge() {
		return age;
	}
	
	
	// setter method
	public void setAge(int age) {
		this.age = age;
	}

	private String Name;

	public String getName() {
		return Name;
	}

	/**
	 * User Name bilgisini set etmek için kullandık
	 * @param name
	 */
	public void setName(String name) {
		Name = name;
	}

}
