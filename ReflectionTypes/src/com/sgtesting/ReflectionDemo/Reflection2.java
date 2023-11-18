package com.sgtesting.ReflectionDemo;

import java.lang.reflect.Method;

public class Reflection2 {

	public static void main(String[] args) {
		Reflection2 obj=new Reflection2();
		{
			try
			{
				Method method[]=obj.getClass().getMethods();
				for(int i=0;i<method.length;i++)
				{
					String name=method[i].getName();
					if(name.startsWith("display"))
					{
						method[i].invoke(obj,null);
					}
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
