package com.sgtesting.Encapsulation;
class Bank
{
	String bankname;
	private int accountNo;
	public void setaccountNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	public int getaccountNo()
	{
		return accountNo;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Bank hdfc=new Bank();
		hdfc.bankname="HDFC Bank";
		System.out.println("Bank Name:"+hdfc.bankname);
		hdfc.setaccountNo(100023);
		int val=hdfc.getaccountNo();
		System.out.println("accountNo:"+val);
	}

}
