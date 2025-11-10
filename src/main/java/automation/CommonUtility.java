package automation;

import java.nio.charset.spi.CharsetProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_cascading_dropdown");
		Thread.sleep(4000);
		
		WebElement subjectDDl = driver.findElement(By.xpath("//select[@id='subject']"));
		CommonMethod_selectByVisibeleText(subjectDDl, "Front-end");		
		
		WebElement TopicsDDl = driver.findElement(By.xpath("//select[@id='topic']"));
		CommonMethod_selectByVisibeleText(TopicsDDl, "CSS");
		
		WebElement chapterddl = driver.findElement(By.xpath("//select[@id='chapter']"));
		CommonMethod_selectByVisibeleText(chapterddl, "Margins");
			
		driver.close();
	}
	
	public static void CommonMethod_selectByVisibeleText(WebElement ele, String str) {
		Select sc = new Select(ele);
		sc.selectByVisibleText(str);		
	}
	

	
	

}
