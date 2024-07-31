package day12;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	      @BeforeMethod
          void Login()
          {
        	  System.out.println("This is login");
          }
	      
	      @AfterMethod
          void logout()
          {
        	  System.out.println("This is logout");
          }
          @Test(priority=1)
          void search()
          {
        	  System.out.println("This is search");
          }
          
          @Test(priority=2)
          void advancesearch()
          {
        	  System.out.println("This is advancesearch");
          }
}
