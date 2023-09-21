package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locators {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Minaz\\AllSoftware\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("minaz");
		driver.findElement(By.name("inputPassword")).sendKeys("paasowrd");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Minaz");
		//using indexes in Xpath and CSS 
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("minaz@g.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("minaz@g.com");
		//to traverse from parent to child usings tags 
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='reset-pwd-btn']")));
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(1000);
		//Xpath regular expression
		driver.findElement(By.xpath("//*[contains(@id,'Username')]")).sendKeys("Rahul");
		//css regular expression
		driver.findElement(By.cssSelector("input[name*='Pass']")).sendKeys("rahulshettyacademy");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='rmbrUsername']")));
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		driver.findElement(By.className("signInBtn")).click();
		driver.quit();
		
		
	}

}
