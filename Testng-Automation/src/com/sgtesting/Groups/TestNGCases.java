package com.sgtesting.Groups;

import org.testng.annotations.Test;

public class TestNGCases {
    @Test(groups="Sanity")
    public void mathod1()
    {
    	System.out.println("It is method1 stattement");
    }
    @Test(groups="Sanity")
    public void method2()
    {
    	System.out.println("It is method2 statement");
    }
    @Test(groups="regression")
    public void method3()
    {
    	System.out.println("It is method3 statement");
    }
    @Test(groups="regression")
    public void method4()
    {
    	System.out.println("It is method4 statement");
    }
}
