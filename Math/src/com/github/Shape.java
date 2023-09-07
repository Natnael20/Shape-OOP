package com.github;

public abstract class Shape {
	
	public abstract double area();
	public abstract double perimeter();
	public void display() {
		System.out.println("The area is " + area() + " and the perimeter is " + perimeter());
	}

}
