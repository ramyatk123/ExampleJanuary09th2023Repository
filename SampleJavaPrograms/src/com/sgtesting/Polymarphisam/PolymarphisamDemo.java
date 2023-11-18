package com.sgtesting.Polymarphisam;
abstract class GeometricFigure
{
	abstract void findArea();
}
class Square extends GeometricFigure
{
	void findArea()
	{
		int a=4;
		System.out.println("Area of the Square :"+(a*a));
	}
}
class Rectangle extends Square
{
	void findArea()
	{
		double b,h;
		b=12.5;
		h=25.0;
		System.out.println("Area of the Rectangle :"+(b*h));
	}
}
class Circle extends Rectangle
{
	void findArea()
	{
		double pi,r;
		pi=3.14;
		r=2.5;
		System.out.println("Area of the Circle :"+(pi*r*r));
	}
}
public class PolymarphisamDemo {

	public static void main(String[] args) {
		GeometricFigure figure=null;
		Square square=new Square();
		Rectangle rectangle=new Rectangle();
		Circle circle=new Circle();
		 figure=square;
		 figure.findArea();
		 
		 figure=rectangle;
		 figure.findArea();
		 
		 figure=circle;
		 figure.findArea();

	}

}
