import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.id("travel_date")).click();
				WebElement month=driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']"));
		while(!month.getText().equalsIgnoreCase("June 2021")){
			driver.findElement(By.cssSelector("[class='datepicker-days'] .next")).click();
		 month=driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']"));
			
		}
		List<WebElement>dates=driver.findElements(By.cssSelector(".day"));
		for(int i=0;i<dates.size();i++){
			if(dates.get(i).getText().equalsIgnoreCase("30")){	
				dates.get(i).click();
				break;
			}
		}
	}

}
