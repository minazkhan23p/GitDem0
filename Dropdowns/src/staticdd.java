import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		/*WebElement staticdropdown=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s=new Select(staticdropdown);
		s.selectByIndex(2);
		Thread.sleep(4000); 	
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByVisibleText("INR");
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(4000);
		s.selectByValue("USD");
		System.out.println(s.getFirstSelectedOption().getText());
		driver.quit();*/
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		for(int i=1;i<4;i++){
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		int k=0;
		while(k<2){
			driver.findElement(By.id("hrefIncChd")).click();
			k++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.quit();
	}

}
