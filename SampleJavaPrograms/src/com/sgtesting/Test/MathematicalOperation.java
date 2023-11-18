package com.sgtesting.Test;
class mathsdemo
{
	mathsdemo(int x,int y,String action)
	{
		switch(action)
		{
		case"add":
			System.out.println("Addition Result:"+(x+y));
			break;
	    case"sub":
	    	System.out.println("Substraction:"+(x-y));
	    	break;
	    case"Mult":
	    	System.out.println("Multiplication:"+(x*y));
	        break;
	    case"div":
	    	System.out.println("division:"+(x/y));
	    	break;
		}
	}
}
public class MathematicalOperation {

	public static void main(String[] args) {
		mathsdemo a=new mathsdemo(20,30,"add");
		mathsdemo b=new mathsdemo(70,30,"sub");
		mathsdemo c=new mathsdemo(20,30,"Mult");
		mathsdemo d=new mathsdemo(90,30,"div");

	}

}
