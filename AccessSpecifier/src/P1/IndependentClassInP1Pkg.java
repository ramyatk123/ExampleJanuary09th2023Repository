package P1;

public class IndependentClassInP1Pkg {
   Protection p=new Protection();
   public IndependentClassInP1Pkg()
   {
	   System.out.println("It is protection class constructor");
		//System.out.println("private_a:"+p.private_a);
		System.out.println("default_b:"+p.default_b);
		System.out.println("protected_c:"+p.protected_c);
		System.out.println("public_d:"+p.public_d);
		System.out.println("+++++++++++");
   }

}
