package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Minaz\\AllSoftware\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[contains(text(),'Free Access')]")).click();
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> it = wins.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String userName = driver.findElement(By.xpath("//a[contains(text(),'mentor')]")).getText();
		System.out.println(userName);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(userName);
		
	}

}
