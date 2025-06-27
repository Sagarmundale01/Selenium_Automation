package Basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConditionsHitesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, 10);

	            // Navigate to Gmail
			driver.get("https://gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
//implicit wait
					
			driver.findElement(By.id("identifierId")).sendKeys("sagar1@gmail.com");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
			driver.findElement(By.id("password")).sendKeys("Pswd1");
			driver.findElement(By.id("signIn")).click();

			WebDriverWait wait1 = new WebDriverWait(driver, 10);  //explicit wait
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	            
	            driver.quit();

	}

}
