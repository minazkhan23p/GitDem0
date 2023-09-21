package Selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		//to add extensions
		options.addExtensions("c:\\w\\s.exe");
		//to set proxy 
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("");
		options.setCapability("proxy", proxy);
		//to download file to default directory
		Map<String, Object> orfs = new HashMap<String, Object>();
		orfs.put("default direct","/directory/path");
		options.setExperimentalOption("orfs", orfs);
		
		System.setProperty("webdriver.chrome.driver","C:\\Minaz\\AllSoftware\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssal.com/");
	}

}
