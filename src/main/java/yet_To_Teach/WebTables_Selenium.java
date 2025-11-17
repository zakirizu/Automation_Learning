package yet_To_Teach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class WebTables_Selenium {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		List<WebElement> rows 		= driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		List<WebElement> columns 	= driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
		int rowSize = rows.size();
		int columnsSize = columns.size();
		
		//System.out.println("Rows Size "+ rowSize);
		//System.out.println("Colums Size "+columnsSize);
		
		for(int i=2 ; i<=rowSize;i++)
		{
			for(int j =1; j<=columnsSize; j++)
			{
				String temp= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(temp+ " ");
			}
			System.out.println("********************");
			
			
		}
		driver.quit();
}
}
