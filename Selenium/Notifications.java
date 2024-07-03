package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications {
	
public static void main(String[] args) {
	
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");

System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver(options);

driver.get("http://spicejet.com");
driver.manage().window().maximize();


}
}