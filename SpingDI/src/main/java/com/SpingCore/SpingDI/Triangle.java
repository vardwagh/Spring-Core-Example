package com.SpingCore.SpingDI;

public class Triangle implements Shape {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Calling Triangle set method");
		
		this.name = name;
	}

	public void draw() {
		System.out.println("Drawing Triangle " + name);
	}

}
