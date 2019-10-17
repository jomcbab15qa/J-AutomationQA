package com.examples;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	private double weight;
	private double height;
	
	public Person(String name,int age,String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		System.out.println("Person [name=" + name + ", age=" + age + ", gender=" + gender + "]");
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
