package intr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Minaz\\AllSoftware\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://acceptance.booking1.sellingplatformconnect.amadeus.com/LoginService/login.jsp?SITE=0SLWNREA&LANGUAGE=GB&refreshOnError=true&appUri=/app_sell2.0/apf/init/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
