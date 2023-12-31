import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vegetable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicit wait
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		/// Thread.sleep(2000);
		String names[] = { "Cucumber", "Beetroot", "Brocolli", "Mushroom" };
		addProduct(driver, names);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		//w.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		/*
		 * vegetable v=new vegetable(); v.addProduct(driver, names);--for non
		 * static
		 */

		driver.quit();
	}

	public static void addProduct(WebDriver driver, String[] names) throws InterruptedException {

		List namesList = Arrays.asList(names);

		List<WebElement> prod = driver.findElements(By.cssSelector(".product-name"));
		int prodSize = prod.size();
		int k = 0;
		for (int i = 0; i < prodSize; i++) {
			String[] name = prod.get(i).getText().split("-");
			String name1 = name[0].trim();
			if (namesList.contains(name1)) {
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				// Thread.sleep(3000);
				k++;
				if (k == names.length) {
					break;
				}
			}
		}
		// Thread.sleep(2000);
	}
}
