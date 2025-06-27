package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		List<WebElement> webelement = (List<WebElement>) driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div"));
		
		System.out.println("Total tags are: "+ webelement.size());
		
		for(int i=0; i<webelement.size(); i++)
		{
			System.out.println("Links on the page are: "+ webelement.get(i).getText());
		}
			
        
		driver.close();
		
	}

}
