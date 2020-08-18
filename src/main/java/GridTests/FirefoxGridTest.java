package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxGridTest {

	public static void main(String[] args) throws MalformedURLException {


		DesiredCapabilities cap1 = new DesiredCapabilities();
		cap1.setBrowserName("firefox");
		cap1.setPlatform(Platform.WINDOWS);
		
		FirefoxOptions foptions = new FirefoxOptions();
		foptions.merge(cap1);
		
		String fhubUrl = "http://192.168.2.18:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(fhubUrl),foptions);
		
		driver.get("https://ui.cogmento.com/home");
		System.out.println(driver.getTitle());
		
	}

}
