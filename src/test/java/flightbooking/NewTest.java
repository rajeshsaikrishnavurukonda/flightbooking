package test.java.flightbooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","/Users/sukanya/Desktop/chromedriver89");
		 driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		 driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 driver.close();
  }
}
