package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import JavaFund.ArrayList;

public class Greenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Minaz\\AllSoftware\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] veggiesNeeded = {"Brocolli","Cucumber","Beetroot"};
		List<String> veggiesNeededList = Arrays.asList(veggiesNeeded);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver,veggiesNeededList);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		`
			

	}
public static void addItems(WebDriver driver, List<String> veggiesNeededList) {
	List<WebElement> prdName = driver.findElements(By.cssSelector("h4.product-name"));
	List<WebElement> addTOCart = driver.findElements(By.cssSelector(".product button[type='button']"));
	int j = 0;
	for(int i=0;i<prdName.size();i++) {
		String productName = prdName.get(i).getText().split(" ")[0].trim();
		if(veggiesNeededList.contains(productName)) {
			j++;
			addTOCart.get(i).click();
			if(j==veggiesNeededList.size()) 
				break;
			
		}
	}
}
}
