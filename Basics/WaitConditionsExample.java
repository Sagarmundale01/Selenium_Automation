package Basics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class WaitConditionsExample {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  //implicit wait
				
		driver.findElement(By.id("Email")).sendKeys("sagar1@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("Pswd1");
		driver.findElement(By.id("signIn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);  //explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		
		
		//FluentWait --provides extra flexibility and operations
		
		FluentWait<WebDriver> wait1 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
			    .pollingEvery(Duration.ofSeconds(2))
			    .ignoring(NoSuchElementException.class);
		
		Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("elementId")));
		
		driver.quit();
		
		

	}

}
