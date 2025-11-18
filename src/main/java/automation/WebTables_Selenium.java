package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables_Selenium {

	
	//table[@name='BookTable']//tr  - Rows
	//table[@name='BookTable']//tr[1]//th - Columns
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		List<WebElement> rows 		= driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		List<WebElement> columns    = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
		
		int rowsSize 	= rows.size();
		int columnSize 	= columns.size();
		
		
		
		for(int i= 2; i<=rowsSize; i++)
		{
			for(int j=1 ; j<=columnSize; j++)
			{
				WebElement tempEle = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]"));
				String text = tempEle.getText();
				System.out.println(text);
			}
			System.out.println("***************");
		}
		
		driver.quit();
		
	}

}
