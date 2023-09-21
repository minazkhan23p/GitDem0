package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webdriverScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Minaz\\AllSoftware\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Actions a = new Actions(driver);
		//count of links on the page 
		int linkcount = driver.findElements(By.tagName("a")).size();
		System.out.println(linkcount);
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		//count of footer section
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		//first column links 
		WebElement columnDriver = footerDriver.findElement(By.cssSelector("[id=gf-BIG] tbody tr td:nth-child(1) ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
		//clcik on each link of the column
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++){
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(click);
			//or 
			//a.moveToElement(columnDriver.findElements(By.tagName("a")).get(i)).keyDown(Keys.CONTROL).click().perform();
		}
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> it = wins.iterator();
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
	}

}
