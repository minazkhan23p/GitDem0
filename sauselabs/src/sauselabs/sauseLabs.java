package sauselabs;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class sauseLabs {
	 public static final String USERNAME = "minazkhan";
	  public static final String ACCESS_KEY = "9fcbb2ef-2aca-42f5-8f2d-7e784b9381a5";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 8.1");
		caps.setCapability("version", "71.0");
		WebDriver driver=new RemoteWebDriver(new URL(URL),caps);
		driver.get("http://www.qaclickacademy.com/");
		System.out.println(driver.getTitle());
	}

}
