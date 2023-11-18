package com.sgtesting.constructorchaining;
class Maths
{
	Maths(int x,int y,String action)
	{
		switch(action)
		{
		case "add":
			System.out.println("Addition Result:"+(x+y));
			break;
		case "sub":
			System.out.println("Substarction Result:"+(x-y));
			break;
		case "mult":
			System.out.println("Multiplication Result:"+(x*y));
			break;
		case "div":
			System.out.println("Division Result:"+(x/y));
			break;
		}
	}
}
public class BasicMathsDemo {

	public static void main(String[] args) {
		Maths a=new Maths(20,30,"add");
		Maths b=new Maths(90,25,"sub");
		Maths c=new Maths(25,66,"mult");
		Maths d=new Maths(90,45,"div");

	}

}
