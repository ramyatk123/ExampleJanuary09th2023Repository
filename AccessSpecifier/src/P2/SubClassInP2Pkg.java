package P2;
import P1.Protection;
public class SubClassInP2Pkg extends Protection
{
    public  SubClassInP2Pkg()
    {

	   System.out.println("It is protection class constructor");
		//System.out.println("private_a:"+private_a);
		//System.out.println("default_b:"+default_b);
		System.out.println("protected_c:"+protected_c);
		System.out.println("public_d:"+public_d);
		System.out.println("+++++++++++");
    }
}
