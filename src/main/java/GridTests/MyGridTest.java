package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyGridTest {

	public static void main(String[] args) throws MalformedURLException {

       chromeBrowser(args);
       firefoxBrowser(args);

	}
	
	public static void chromeBrowser(String[] args) throws MalformedURLException {
		 //1. define desired capability 
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//2.Chrome Options definition :
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = "http://192.168.2.18:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("https://ui.cogmento.com/home");
		System.out.println(driver.getTitle());
	}
	public static void firefoxBrowser(String[] args) throws MalformedURLException {
		
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
				
				FirefoxOptions foptions = new FirefoxOptions();
				foptions.merge(cap);
				
				String fhubUrl = "http://192.168.2.18:4444/wd/hub";
				WebDriver driver = new RemoteWebDriver(new URL(fhubUrl),foptions);
				
				driver.get("http://www.google.com");
				System.out.println(driver.getTitle());
	}

}
