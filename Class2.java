package day13;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 
{
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
	
	@AfterTest
	void logout()
	{
		System.out.println("This is a AfterTest Method");
	}
	
	@AfterClass
	void logout2()
	{
		System.out.println("This is a AfterClass Method");
	}
	
}
