package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirstAutomationTestCase {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.close();

	}

}
