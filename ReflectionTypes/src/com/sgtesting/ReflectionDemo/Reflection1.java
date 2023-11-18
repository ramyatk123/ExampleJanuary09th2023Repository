package com.sgtesting.ReflectionDemo;

import java.lang.reflect.Method;

public class Reflection1 {

	public static void main(String[] args) {
		Reflection1 obj=new Reflection1();
		{
			try
			{
				Method method[]=obj.getClass().getMethods();
				for(int i=0;i<method.length;i++)
				{
					String name=method[i].getName();
					System.out.println(name);
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
