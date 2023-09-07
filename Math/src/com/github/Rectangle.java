package com.github;

public class Rectangle extends Shape {

	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area() {
		int getArea =  Math.addExact(width, length);
		return getArea;
	}

	@Override
	public double perimeter() {
		int getParimeter = 2 * Math.addExact(width, length);
		return getParimeter;
	}
	
	@Override
	public void display() {
		System.out.println("The area of the rectangle is " + area() + " and the perimeter is " + perimeter());
	}
	
	
}
