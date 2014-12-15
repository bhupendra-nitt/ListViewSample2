package com.example.sam;

public class Student {
	int img;
	String Name;
	int Age;
	public int getImg() {
		return img;
	}
	public void setImg(int img) {
		this.img = img;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Student(int img, String name, int age) {
		super();
		this.img = img;
		Name = name;
		Age = age;
	}
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	

}
