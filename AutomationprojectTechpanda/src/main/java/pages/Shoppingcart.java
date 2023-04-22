package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shoppingcart {
	WebDriver driver;
	By qtyinput=(By.xpath("//input[@title='Qty']"));
	By update=(By.xpath("//button[@title='Update']//span//span[contains(text(),'Update')]"));
	By errormessage=(By.xpath("//span[contains(text(),'Some of the products cannot be ordered in requeste')]"));
	By emptycart=(By.xpath("//span[contains(text(),'Empty Cart')]"));
	By emptycartmessage=(By.xpath("//div/h1"));




	public Shoppingcart (WebDriver driver) {
		this.driver=driver;
	}


	public void qtyinputandupdate(){
		driver.findElement(qtyinput).sendKeys("1000");
		driver.findElement(update).click();
	} 

	public String errormesssage() {
		return driver.findElement(errormessage).getText();

	}
	public void emptycart(){
		driver.findElement(emptycart).click();
	} 

	public String emptycartmessage(){
		return driver.findElement(emptycartmessage).getText();
	} 
}
