package P2;
import P1.Protection;
public class IndependentclassInP2Pkg {
	Protection o=new Protection();
	public IndependentclassInP2Pkg()
	{
		 System.out.println("It is protection class constructor");
			//System.out.println("private_a:"+o.private_a);
			//System.out.println("default_b:"+o.default_b);
			//System.out.println("protected_c:"+o.protected_c);
			System.out.println("public_d:"+o.public_d);
			System.out.println("+++++++++++");
	}
}
