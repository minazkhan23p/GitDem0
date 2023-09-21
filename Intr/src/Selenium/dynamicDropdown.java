package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Minaz\\AllSoftware\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hrefIncAdt")));
		int i =0;
		while(i<=2) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
//		for(int i=0;i<=2;i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
