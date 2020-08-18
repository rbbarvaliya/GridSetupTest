package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTwoNodeTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		
		 //1. define desired capability 
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//2.Chrome Options definition :
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = "http://192.168.2.18:4444/wd/hub";
	    driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("https://ui.cogmento.com/home");
		System.out.println("Before login Title is "+ driver.getTitle());
//	    driver.findElement(By.name("email")).sendKeys("ravindrabarvaliya369@gmail.com");
//	    driver.findElement(By.name("password")).sendKeys("Rb@199010");
//	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//	    Thread.sleep(2000);
//	    System.out.println("After login Title is "+ driver.getTitle());
//	    boolean a = driver.findElement(By.xpath("//span[@class='user-display']")).isDisplayed();
//	    System.out.println(a);
//	    String b = driver.findElement(By.xpath("//span[@class='user-display']")).getText();
//	    System.out.println(b);
		
		
		
		DesiredCapabilities cap1 = new DesiredCapabilities();
		cap1.setBrowserName("firefox");
		cap1.setPlatform(Platform.WINDOWS);
		
		FirefoxOptions foptions = new FirefoxOptions();
		foptions.merge(cap1);
		
		String fhubUrl = "http://192.168.2.18:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(fhubUrl),foptions);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

}
