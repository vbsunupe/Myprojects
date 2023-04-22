package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class Productcomparisonlist {

	WebDriver driver;
	By comparisontitle=By.xpath("//h1");
	By closewindow=(By.xpath("//div/button[@type='button']"));
	//By closewindow=(By.xpath("//button[@title='Close Window']"));

	public Productcomparisonlist (WebDriver driver) {
		this.driver=driver;
	}
	public  String verifytitle() {
		return driver.findElement(comparisontitle).getText();
	}
	public void verifypopup (){
		driver.switchTo().newWindow(WindowType.TAB);
	}

	public void closewindow() {
		driver.findElement(closewindow).click();

	}

	
}









