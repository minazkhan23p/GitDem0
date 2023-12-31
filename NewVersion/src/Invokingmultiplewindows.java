import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Invokingmultiplewindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//switching window 
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> win=driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/#/index");
		String name=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		driver.switchTo().window(parent);
		WebElement field=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		field.sendKeys(name);
		//taking sc
		File sc=field.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("new.png"));
		
		//get height and width
	System.out.println(field.getRect().getDimension().getHeight());
	System.out.println(field.getRect().getDimension().getWidth());
		
	}

}
