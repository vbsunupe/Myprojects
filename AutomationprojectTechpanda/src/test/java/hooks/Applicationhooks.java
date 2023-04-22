package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilites.ConfigReader;


public class Applicationhooks {
	private Baseclass baseDriver;
	private WebDriver  driver;
	private ConfigReader configreader;
	Properties prop;

	@Before(order=0)
	public void getReader() throws IOException {
		configreader=new ConfigReader();	
		prop= configreader.configreader();

	}
	@Before(order=1)
	public void launchbrowser() {
		String browserName=prop.getProperty("browser");
		baseDriver=new Baseclass();
		driver=baseDriver.initializeDriver(browserName);

	}
	@After(order=0)
	public void quitBrowser() {
		driver.quit();	
	}
	@After(order=1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed())	{

			String	ScenarioName=scenario.getName().replaceAll(" ", "_");
			byte[]imagePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(imagePath, "image/png", ScenarioName);

		}

	}

}
