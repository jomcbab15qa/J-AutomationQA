package com.examples;

import com.interafce.Shape;

public class Circle implements Shape {
	
	private final int radius;
	final double pi = Math.PI;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle drawn");
	}
	
	@Override
	public double area() {
		System.out.println("Inside Circle");
		return pi * Math.pow(radius, 2);
	}

}
