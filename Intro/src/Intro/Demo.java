package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ftssoha.ultria.com/sso/login");
		// driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		/*
		 * driver.findElement(By.id("emailAddress")).sendKeys(
		 * "admin.lm@ultria.com");
		 * driver.findElement(By.id("password")).sendKeys("Asdf@123");
		 * driver.findElement(By.id("signIn")).click();
		 */
		/*
		 * driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(
		 * "admin.lm@ultria.com");
		 * driver.findElement(By.xpath("//*[@id='password']")).sendKeys(
		 * "Asdf@123");
		 * driver.findElement(By.xpath("//*[@id='signIn']")).click();
		 */
		/*
		 * 
		 * driver.findElement(By.cssSelector("#emailAddress")).sendKeys(
		 * "admin.lm@ultria.com");
		 * driver.findElement(By.cssSelector("#password")).sendKeys("Asdf@123");
		 * driver.findElement(By.cssSelector("#signIn")).click();
		 */
		// driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("123");

		// driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		// #i10 > th > a
		/*
		 * String title=driver.getTitle();
		 * System.out.println("title is "+title);
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getPageSource());
		 * driver.get("https://www.google.com/"); Thread.sleep(2000);
		 * driver.navigate().back(); Thread.sleep(2000);
		 * System.out.println(driver.getTitle());
		 */
		/*driver.findElement(By.cssSelector("input[id='emailAddress']")).sendKeys("admin.lm@ultria.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Asdf@123");
		driver.findElement(By.cssSelector("input[id='signIn']")).click();*/
		
		driver.findElement(By.xpath("//div[@id='pnl_loginForm']/form/fieldset[2]/div/input")).sendKeys("adn.lm@ultria.com");
		driver.findElement(By.xpath("//input[contains(@id,'passw')]")).sendKeys("Asdf@123");
		driver.findElement(By.cssSelector("input[id='signIn']")).click();
		Thread.sleep(2000);
		driver.quit();
		Demo1 d = new Demo1();
		System.out.println(d.Sum());
	}

}
