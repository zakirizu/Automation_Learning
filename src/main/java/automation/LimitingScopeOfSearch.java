package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LimitingScopeOfSearch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		List<WebElement> listOfFooterLinks = driver.findElements(By.xpath("//footer//a"));
		
		int totalLinks = listOfFooterLinks.size();
		
		for(int i=0; i<totalLinks; i++)
		{
			WebElement tempLink = listOfFooterLinks.get(i);
			String linkText = tempLink.getText();
			System.out.println(linkText);
		}
		driver.quit();
		
	}

}
