package com.github;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double getArea = Math.PI * radius * radius;
		return Math.round(getArea);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		double perimeter = 2 * Math.PI * radius;
		return Math.round(perimeter);
	} 
	
	@Override
	public void display() {
		System.out.println("The area of the circle is " + area() + " and the perimeter is " + perimeter());
	}

}
