import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		Thread.sleep(4000);
		List<WebElement> el=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		Thread.sleep(1000);
		for(WebElement option:el){
			if(option.getText().equalsIgnoreCase("india")){
				option.click();
				System.out.println("success");
				Thread.sleep(4000);
				break;
			}
		}
		driver.quit();
		
		
		//li[@class='ui-menu-item']
	}

}
