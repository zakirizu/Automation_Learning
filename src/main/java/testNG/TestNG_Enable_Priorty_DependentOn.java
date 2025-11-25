package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_Enable_Priorty_DependentOn {
	
	@Test(priority = 4)
	public void Apple() {
		System.out.println("Apple");
	}

	
	@Test(priority = 3 , enabled = false)
	public void Dog() {
		System.out.println("Dog");
	}

	
	@Test(priority = 1)
	public void Cat()
	{
		System.out.println("Cat");
	}
	
	
	@Test(priority = 2, dataProvider = "ValidLoginData")
	public void Boy(String a, String b)
	{
		System.out.println("Boy");
	}
	
	@Test(dependsOnMethods = "placingOrder" )
	public void orderNotification() {
		System.out.println("Order Notification");
	}
		
	@Test
	public void placingOrder()
	{
		System.out.println("placingOrder");
	}
	
		

	@DataProvider(name = "ValidLoginData")
	public Object[][] getValidData(){
		return new Object[][] {
			{"userName01", "PassWord01"},
			{"userName01", "PassWord01"},
						
		};
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
