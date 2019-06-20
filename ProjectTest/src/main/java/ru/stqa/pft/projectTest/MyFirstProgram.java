package ru.stqa.pft.projectTest;

public class MyFirstProgram {
	
	public static void main(String[] args) {
	 hello("World");
		hello("User");
		hello("Nadya");

		double length = 5;
		double a = 2;
		double b = 5;
		System.out.println("Площадь квадрата = " + area(length));

		System.out.println("Площадь квадрата = " + area(a, b));
	}

	public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area (double l){
		return l * l;
	}

	public static double area (double a, double b){
		return a * b;
	}

}