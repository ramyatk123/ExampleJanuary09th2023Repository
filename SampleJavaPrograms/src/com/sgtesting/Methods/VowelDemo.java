package com.sgtesting.Methods;

public class VowelDemo {
	
		   String ovwel(char ch) {

			   switch(ch)

			   {

			      case 'a':case'e':case'i':case'o':case'u':
		          break;
				  default:
				   return " It not a vowel";

			   }

			   return "It is a vowel";

		   }

		
	public static void main(String[] args) {
	
		 VowelDemo o=new VowelDemo();

    	 String o1=o.ovwel('a');

    	 System.out.println(o1);
	}

}
