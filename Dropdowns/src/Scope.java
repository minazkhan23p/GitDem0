import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int noOfLinks=driver.findElements(By.tagName("a")).size();
		System.out.println(noOfLinks);
		WebElement footerdriver=driver.findElement(By.cssSelector("#gf-BIG"));
		int noOfLinks2=footerdriver.findElements(By.tagName("a")).size();
		System.out.println(noOfLinks2);
		WebElement footerdriver1=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul[1]"));
		int noOfLinks3=footerdriver1.findElements(By.tagName("a")).size();
		
		for(int i=1;i<=noOfLinks3-1;i++){
			String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerdriver1.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(5000);
		}
			Set<String>winds=driver.getWindowHandles();
			Iterator<String>it=winds.iterator();
			while(it.hasNext()){
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		
		System.out.println(noOfLinks3);
		driver.quit();
		
	}

}
