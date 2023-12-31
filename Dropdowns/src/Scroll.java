import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=400");
		List<WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		int sum=0;
		for(WebElement value:values){
			int number=Integer.parseInt(value.getText());
			sum+=number;
		}
		System.out.println(sum);
		String total=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int totalNumber=Integer.parseInt(total);
		Assert.assertEquals(totalNumber, sum);	
		
	}

}
