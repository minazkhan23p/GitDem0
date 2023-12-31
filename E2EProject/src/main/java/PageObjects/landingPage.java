package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class landingPage {

	public WebDriver driver;

	public landingPage(WebDriver driver) {
		this.driver = driver;
	}

	private By login = By.cssSelector("a[href*='sign_in']");//making variables private and accessible methods public to achieve encapsulation
	private By title = By.xpath("//h2[text()='Featured Courses']");
	private By contactTab = By.xpath("//a[text()='Contact']");
	private By nothanks = By.xpath("//button[text()='NO THANKS']");
	
	@FindBy(xpath="//div[contains(@class,'col-sm-6 col-md-8 hidden-xs video-banner')]/h3")
	WebElement header;

	public LoginPage login() {
		 driver.findElement(login).click();
		return   new LoginPage(driver);
	}
	
	public WebElement title() {
		return driver.findElement(title);
	}
	
	public WebElement contactTab() {
		return driver.findElement(contactTab);
	}
	public WebElement nothanks() {
		return driver.findElement(nothanks);
	}
	public List<WebElement> nothankspopup() {
		return driver.findElements(nothanks);
	}
	
	
	public WebElement header() {
		return header;
	}

}
