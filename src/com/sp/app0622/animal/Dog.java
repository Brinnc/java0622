package com.sp.app0622.animal;

public class Dog {
	String name;
	
	//생성자도 메서드이므로 당연히 오버로딩이 적용됨!!
	public Dog(String name) {
		this.name=name;
	}
	public Dog() {
		
	}
	
	public static void main(String[] args) {
		new Dog("멍멍");
		System.out.println("강아지 탄생");
	}
}
