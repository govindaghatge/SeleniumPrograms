package day11;

import org.testng.annotations.Test;

public class FirstTestCase 
{
      @Test(priority=1)
      void Openapp()
      {
    	  System.out.println("Opening the application");
      }
      @Test(priority=4)
      void Login()
      {
    	  System.out.println("Login the application");
      }
      @Test(priority=2)
      void Logout()
      {
    	  System.out.println("Logout the application");
      }
}
