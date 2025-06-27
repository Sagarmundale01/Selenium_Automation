package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.getTitle();
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
		
		System.out.println("selenium");
	    System.out.println("automation");
	    
	    driver.close();

	}

}
