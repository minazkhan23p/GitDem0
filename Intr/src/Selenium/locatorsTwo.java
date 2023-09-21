package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;	

public class locatorsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "rahul";
		System.setProperty("webdriver.chrome.driver","C:\\Minaz\\AllSoftware\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String password = getPassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("p")));
//		System.out.println(driver.findElement(By.tagName("p")).getText());
//		org.testng.Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//		org.testng.Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
//		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.quit();
		

	}
	
	public static String getPassword(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='reset-pwd-btn']")));
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String[] pass = (driver.findElement(By.cssSelector(".infoMsg")).getText()).split("'");
		return pass[1];
		
		
	}
}
