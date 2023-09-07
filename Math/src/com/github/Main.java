package com.github;

/*16. Write a Java program to create a 
 * class called "Shape" with abstract 
 * methods for calculating area and perimeter, 
 * and subclasses for "Rectangle", "Circle", 
 * and "Triangle".
 */



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(19,41);
		rectangle.display();
		Circle circle = new Circle(51.0);
		circle.display();
		Triangle triangle = new Triangle(41,55,13);
		triangle.display();
		
		

	}

}
