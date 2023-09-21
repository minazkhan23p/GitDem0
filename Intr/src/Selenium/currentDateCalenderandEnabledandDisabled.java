package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class currentDateCalenderandEnabledandDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Minaz\\AllSoftware\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.className("picker-second")).getAttribute("style").contains("1")){
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		WebElement dd = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		dd.click();
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'])//a[@value='MAA']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'])//a[@value='BLR']")).click();
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();
	}

}
