package com.crm.projectsample1;

import org.testng.annotations.Test;

public class GetParametersTest {
	@Test
	public void getParam()
	{
	 System.out.println(System.getProperty("browser"));
	 System.out.println(System.getProperty("url"));
	 System.out.println(System.getProperty("username"));
	 System.out.println(System.getProperty("password"));
	 
	}

}
