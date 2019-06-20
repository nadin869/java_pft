package ru.stqa.pft.projectTest;

public class MyFirstProgram {
	
	public static void main(String[] args) {
	 hello("World");
		hello("User");
		hello("Nadya");

		Square s = new Square(5);
		Rectangle r = new Rectangle(2, 5);

	  System.out.println("Площадь квадрата = " + s.area());

		System.out.println("Площадь квадрата = " + r.area());
	}

	public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}


}