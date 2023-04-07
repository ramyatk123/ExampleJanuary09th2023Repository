package MainDemo;

import P1.IndependentClassInP1Pkg;
import P1.Protection;
import P1.SubClass;
import P2.IndependentclassInP2Pkg;
import P2.SubClassInP2Pkg;

public class MainDemo {

	public static void main(String[] args) {
		//Execute protection class constructor
		//Protection p=new Protection();
		//Execute subclass  constructor
       // SubClass sub1=new SubClass();
      //Execute IndependentClassInP1Pkg  constructor
       // IndependentClassInP1Pkg ind=new IndependentClassInP1Pkg();
        //Execute SubClassInP2Pkg  constructor
       // SubClassInP2Pkg sub2=new SubClassInP2Pkg();
      //Execute SubClassInP2Pkg  constructor
        IndependentclassInP2Pkg ind2=new IndependentclassInP2Pkg();
	}

}
