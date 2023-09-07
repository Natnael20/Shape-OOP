package com.github;

public class Triangle extends Shape {

	private double height;
	private double base;
	private double side;
	
	public Triangle(double height,double base, double side) {
		this.height = height;
		this.base = base;
		this.side = side;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = (this.height * this.base / 2);
		return area;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		double perimeter = base + Math.pow(side, 2);
		return perimeter;
	}
	
	@Override
	public void display() {
		System.out.println("The area of the triangle is " + area() + " and the perimeter is " + perimeter());
	}
	
}
