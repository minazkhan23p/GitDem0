import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));

		System.out.println(driver.findElement(withTagNbbame("label").above(nameEditBox)).getText());

		WebElement dateofBirth= driver.findElement(By.cssSelector("[for='dateofBirth']"));

		driver.findElement(withTagName("input").below(dateofBirth)).sendKeys("02/02/1992");

		WebElement iceCreamLabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(withTagName("input").toLeftOf(iceCreamLabel)).click();

		//Get me the label of first Radio button

		WebElement rb=driver.findElement(By.id("inlineRadio1"));

		System.out.println(driver.findElement(withTagName("label").toRightOf(rb)).getText());

		}



}
