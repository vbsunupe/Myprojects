package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	WebDriver driver;
	public static  ThreadLocal<WebDriver>tdriver=new ThreadLocal<WebDriver>();
	public static WebDriver initializeDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			//driver = new ChromeDriver();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			tdriver.set(new ChromeDriver(option));
		} else if (browser.equalsIgnoreCase("firefox")) {
			//driver = new FirefoxDriver();
			tdriver.set(new FirefoxDriver());   

		} else {
			System.out.println("Unsupported Browser");
		}
		getDriver().manage().window().maximize(); 
		getDriver().manage().deleteAllCookies();
		return getDriver();


	}
	public static synchronized WebDriver getDriver() {
		return tdriver.get();

	}
	public static void main(String[] args) {
		Baseclass bclass=new Baseclass();
		bclass.initializeDriver("chrome");
	}

}
