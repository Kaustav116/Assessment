package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelsPage {
	public WebDriver driver;	
	By address=By.xpath("//div[contains(text(), 'Kolkata')]");	
	public HotelsPage(WebDriver driver) {		
		this.driver=driver;	
	}
	public WebElement getAddress()
	{
		return driver.findElement(address);
	}
}
