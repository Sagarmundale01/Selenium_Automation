package Basics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// driver.manage().deleteCookieNamed("sessionKey");

		// click on any link
		// login page- verify login url

		driver.get("http://google.com");
		System.out.println(driver.getTitle());
			
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//Files.copy(src, new File("C:\\Users\\sagar\\Pictures"));

	}

}
