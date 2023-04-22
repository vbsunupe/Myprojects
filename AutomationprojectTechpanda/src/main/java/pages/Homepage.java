package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	By pagetitle=By.xpath("//div[@class='page-title']");
	By mobilemenu=By.xpath("//a[normalize-space()='Mobile']");


	public Homepage (WebDriver driver) {
		this.driver=driver;
	}


	public String homepagepagetitle() {
		return driver.getTitle();
	}

	public void clickonmobilemenu() {
		driver.findElement(mobilemenu).click();
	}

}
