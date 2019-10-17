package com.interafce;

public class Rectangle implements Shape {
	
	int length , width;
	
	

	Rectangle(int length, int width) {
		
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("Rectanglre Drawn");
		
	}

	@Override
	public double area() {
		System.out.println("Inside Rectangle");
		 return (double)(length*width);
	}
	
	

}
