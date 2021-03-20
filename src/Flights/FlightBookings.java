package Flights;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FlightBookings {
	//main function starts here
	
	 public static void main(String args[]) throws InterruptedException {
     WebDriver driver;
	 System.setProperty("webdriver.chrome.driver","/Users/sukanya/Desktop/chromedriver89");
	 driver = new ChromeDriver();
	 //driver.get("https://www.spicejet.com/"); 
	 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	 
	 Thread.sleep(3000);
	 
	//Radio button
	//driver.findElement(By.cssSelector("input[value='RoundTrip'")).click();

	 
	 //Select Dynamic Dropdownlist From and To
	 
	 //driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
	 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	 Thread.sleep(2000);
	 ////*[@id="dropdownGroup1"]/div/ul[1]/li[8]/a
	
	 driver.findElement(By.xpath("//a[@value='BLR']")).click();
	 driver.close();
	
	 //2 ways to write dynamic dropdown
	 //Thread.sleep(3000);
	//driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[8]/a")).click();
	 
	 //Parent and Child Relationship //tagname@attributename='value'
	 
	//glsctl00_mainContent_ddl_destinationStation1_CTNR
	 //driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JAI']")).click();
	 //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	 //driver.close();
	 
	 //Selecting DATE
	 
	/*driver.findElement(By.className(" ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today")).click();
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	 
	 //Select Checkboxes
	 
	//System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
	System.out.println(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
	//driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).click();
	//System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
	//System.out.println(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
	List<WebElement> CHECKBOXlist = driver.findElements(By.cssSelector("input[type='checkbox']"));
    System.out.println("Total Check Boxes are avaliable here are: "+CHECKBOXlist.size());
	
	
	 //Select Static DropdownList and //create instance for select class
	
	 WebElement DrpdownlistStatic=driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
	 Select Drpdown=new Select(DrpdownlistStatic);
	 Thread.sleep(5000);
	 Drpdown.selectByIndex(3);
	 System.out.println(Drpdown.getFirstSelectedOption().getText());
	 Drpdown.selectByValue("INR");
	 //Thread.sleep(5000);
	 //System.out.println(Drpdown.getFirstSelectedOption().getText());
	 //Drpdown.selectByVisibleText("AED");
	 //Thread.sleep(5000);
	 System.out.println(Drpdown.getFirstSelectedOption().getText());
	 
	//Bahaviourial dropdown-List of options and we need to select from them
	//First capture list of options in one container and pick one by one and compare with the desired text and the break
	 
	 /*driver.findElement(By.id("autosuggest")).sendKeys("Ind");
	 Thread.sleep(3000);
	 List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	 for(WebElement option :options)
	 {
		 if(option.getText().equalsIgnoreCase("India"))
	      {
			 option.click();
		    break;
	}
	 }*/
	 
	 //Select Passengers List
	 
	/* driver.findElement(By.className("paxinfo")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
	 WebElement DrpdownlistPassenger=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	 Select Drpdownpass=new Select(DrpdownlistPassenger);
	 Thread.sleep(5000);
	 Drpdownpass.selectByIndex(3);
	 System.out.println(Drpdownpass.getFirstSelectedOption().getText());
	 Drpdownpass.selectByValue("3");*/
	 

	 /*for(int j=0;j<=2;j++)
	 {
		driver.findElement(By.id("hrefIncChd")).click();
	 }
	 for(int k=0;k<=1;k++)
	 {
		 driver.findElement(By.id("hrefIncInf")).click();
	 }*/
	 //driver.findElement(By.id("btnclosepaxoption")).click();
	
	 
	 
	 } 
	 
	   
}

	 

	
	 
