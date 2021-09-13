package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BenefitsPage {
	public WebDriver driver;
	By mssg=By.xpath("//h3[contains(text(),'Mobile Check-In and Mobile Key')]");
	public BenefitsPage(WebDriver driver) {		
		this.driver=driver;		
	}
	public WebElement getMssg()
	{
		return driver.findElement(mssg);
	}
}
