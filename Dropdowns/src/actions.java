import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// actions
		/*
		 * driver.get("https://www.amazon.com/");
		 * driver.manage().window().maximize();
		 *  Actions a =new Actions(driver);
		 * a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("minaz").doubleClick().build().perform();
		 * a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).contextClick().build().perform();
		 * Thread.sleep(2000); driver.quit();
		 */
		// window haandles
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> tabs=windows.iterator();
		String parent=tabs.next();
		String child=tabs.next();
		driver.switchTo().window(child);	
		String EmailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at ")[1].trim().split(" ")[0].trim();
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(EmailId);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
