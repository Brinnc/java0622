package com.sp.app0622.car;

public class SportsCar {
	String color="none color";
	
	public SportsCar() {
		color="black";
	}
	
	public void setColor(){
		color="red";
		//this.color=color;
	}

	public static void main(String[] args) {
		SportsCar s=new SportsCar();
		//c.setColor("red");
		s.setColor();
		System.out.println(s.color);
	}
}
