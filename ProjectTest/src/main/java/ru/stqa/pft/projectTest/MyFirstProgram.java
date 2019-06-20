package ru.stqa.pft.projectTest;

public class MyFirstProgram {
	
	public static void main(String[] args) {
	 hello("World");
		hello("User");
		hello("Nadya");

		Square s = new Square(5);
		Rectangle r = new Rectangle(2, 5);

	  System.out.println("Площадь квадрата = " + area(s));

		System.out.println("Площадь квадрата = " + area(r));
	}

	public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area (Square s){
		return s.l * s.l;
	}

	public static double area (Rectangle r){
		return r.a * r.b;
	}

}