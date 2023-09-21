package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class e2eFlioghtBooking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Minaz\\AllSoftware\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dd = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		dd.click();
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'])//a[@value='MAA']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'])//a[@value='BLR']")).click();
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hrefIncAdt")));
		int i =0;
		while(i<=2) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		if(driver.findElement(By.className("picker-second")).getAttribute("style").contains("0.5")){
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}


}
