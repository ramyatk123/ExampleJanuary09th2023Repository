package com.sgtesting.Groups;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
     @Test(dataProvider="credentials")
     public void testingData(String user,String pwd)
     {
    	 System.out.println(user+" --> "+pwd);
     }
     @DataProvider(name="credentials")
     public Object[][] getCredentials()
     {
    	 return new Object[][] {{"demouser1","welcome1"},{"demouser2","welcome2"},{"demouser3","welcome3"}};
     }
}
