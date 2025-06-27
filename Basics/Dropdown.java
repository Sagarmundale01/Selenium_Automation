package Basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

             public class Dropdown {

             public static void main(String[] args) throws InterruptedException {

            
             // ChromeOptions options = new ChromeOptions();

             //Add chrome switch to disable notification - "**--disable-notifications**"
             
             //options.addArguments("--disable-notifications");
            	
             System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
             
             WebDriver driver =new ChromeDriver();

             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             
             driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

             driver.manage().window().maximize();
                                
             //a[@value='MAA']  -Xpath for chennai
             //a[@value='BLR']

            // driver.switchTo().alert().sendKeys("Allow");
            // Alert alert = driver.switchTo().alert();
            // alert.dismiss();
             
             driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
             driver.findElement(By.xpath("//a[@value='BLR']")).click();

             Thread.sleep(2000);

             //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

             driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

             driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

         }

  }



