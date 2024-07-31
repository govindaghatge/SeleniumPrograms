package day13;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 
{
	@BeforeTest
	void login()
	{
		System.out.println("This is a BeforeTest Method");
	}
	
	@BeforeClass
	void login1()
	{
		System.out.println("This is a BeforeClass Method");
		
	}
	
	@Test
	void search()
	{
		System.out.println("This is a search Method");
	}
	
	@AfterClass
	void logout2()
	{
		System.out.println("This is a AfterClass Method");
	}
}
