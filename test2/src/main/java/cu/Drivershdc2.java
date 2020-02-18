package cu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivershdc2 {

	public static WebDriver getDriver(String vr) {
		// TODO Auto-generated method stub
		if(vr.equals("CRM"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(vr.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else if(vr.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else
			return null;

	}

}
