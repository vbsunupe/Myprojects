package pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class Mobilepage {
     WebDriver driver;
	By mobilepagetitle=By.xpath("//h1[normalize-space()='Mobile']");
	By mobilesortby=By.xpath("//select[@title=\"Sort By\"]");
	By costofsonyxxperia=By.xpath("//span[contains(text(),'$100.00')]");
	By costofsonyexperiaondetailpage=By.xpath("//span[@class='price']");
	By sonyxperia=By.xpath("//img[@id='product-collection-image-1']");
	By sortedlist=(By.xpath("//h2[@class='product-name'])"));
	By mobilemmenu=(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[2]/div[1]/div[3]/button[1]"));
	By mobile=(By.xpath("//a[normalize-space()='Mobile']"));
	By comparemobile1=(By.xpath("//li[2]//div[1]//div[3]//ul[1]//li[2]//a[1]"));
	By comparemobile2=(By.xpath("//li[2]//div[1]//div[3]//ul[1]//li[2]//a[1]"));
	By comparebutton=(By.xpath("//button[@title='Compare']//span//span[contains(text(),'Compare')]"));


	public Mobilepage(WebDriver driver) {
		this.driver = driver;
	}

	public String mobilepagetitle() {
		return driver.findElement(mobilepagetitle).getText();
	}

	public void selectdropdown() {
		WebElement	sortby =driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='page']/div[@class='main-container col3-layout']/div[@class='main']/div[@class='col-wrapper']/div[@class='col-main']/div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/select[1]"));
		Select select=new Select(sortby);
		select.selectByIndex(1);
	}
	public void verifyproductsortedbyname() {
	    List<WebElement>sortedlist=driver.findElements(By.xpath("(//h2[@class='product-name'])"));
		List<String>names=new ArrayList<String>();
		for(WebElement ele:sortedlist) {
			names.add(ele.getText());
		}
	
		System.out.print(assertEquals(sortedlist,names));
	}

	private boolean assertEquals(List<WebElement> sortedlist, List<String> names) {
		
		return true;
	}

	public String readsonyxperiacost() {
		return driver.findElement(costofsonyxxperia).getText();
	}

	
	public void clicksonyxperia() {
		driver.findElement(sonyxperia).click();
	}
	public String resdsonyxperiacostondetailpage() {
		return driver.findElement(costofsonyexperiaondetailpage).getText();
	}
	public void sonyxperiaaddtocart() {
		driver.findElement(mobilemmenu)	.click();

	}

	public void comparemobiles() {

		driver.findElement(comparemobile1).click();
		driver.findElement(comparemobile2).click();

	}
	public void clickoncompare() {
		driver.findElement(comparebutton).click();

	}

}
/*	List<WebElement>sortedlist=driver.findElements(By.xpath("(//h2[@class='product-name'])"));
		List<String>names=new ArrayList<String>();
		for(WebElement ele:sortedlist) {
		names.add(ele.getText());
		}
		System.out.println(names);*/
//span[normalize-space()='Sony Xperia was added to your shopping cart.']
