import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ag-grid.com/example.php");
		List<WebElement> name=driver.findElements(By.xpath("//div[@class='ag-center-cols-container']/div/div/div/span"));
		List<WebElement> language=driver.findElements(By.xpath("//div[@class='ag-center-cols-container']/div/div[2]"));
		for(int i=0;i<2;i++){
			System.out.println(name.get(i).getText()+" "+language.get(i).getText());
			
		}
		driver.quit();
		
	}

}
