package com.sgtesting.ReflectionDemo;

import java.lang.reflect.Method;

public class Reflection3 {

	public static void main(String[] args) {
		Reflection3 obj=new Reflection3();
		{
			try
			{
				Method method[]=obj.getClass().getDeclaredMethods();
				for(int i=0;i<method.length;i++)
				{
					String name=method[i].getName();
					System.out.println(name);
					method[i].invoke(obj,null);
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
