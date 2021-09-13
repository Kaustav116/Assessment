package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By module1=By.xpath("//p[contains(text(),'Our Brands')]");
	By listing=By.cssSelector("a[href*='https://jw-marriott.marriott.com/']");
	By city=By.id("CXQ81RTM_search-location");	
	By search=By.cssSelector("body.t-bg-extralightgrey.no-scroll.sub-takover-opened:nth-child(2) div.page-container.fixed-header:nth-child(3) div.id-content-wrapper div.l-row:nth-child(1) section.mi-sub-section.sub-section.t-bg-standard-20.l-margin-subsection-bottom-large.l-margin-tile-vertical-default.l-padding-tile-vertical-default.l-padding-subsection-vertical-none:nth-child(2) div.l-print-fullbleed.l-container div.l-s-col-4.l-m-col-8.l-s-col-last.l-m-col-last.l-l-col-12.l-xl-col-12.l-l-col-last.l-xl-col-last div.is-new-ux div.tile-hsearch-homepage.m-homepage-hsearch.l-hsearch-2.l-hsearch-takeover.l-hsearch-cntnr.l-hsearch-bottom.animate-search-form.transition-complete.is-opened:nth-child(4) div.clearfix.homepage-search-form.l-form-container.l-clear form:nth-child(2) div.l-form-group.m-field-wrap.l-hsearch-labels.clearfix:nth-child(73) div.l-xs-col-4.l-xl-col-4.l-xl-last-col.l-hsearch-find.l-find-top.js-hform-fields.l-hsearch-find-homepage:nth-child(9) > button.analytics-click.js-is-roomkey-enabled.m-button.m-button-primary");
	By module2=By.xpath("//p[contains(text(),'About Marriott Bonvoy')]");
	By button=By.cssSelector("a[href*='/loyalty/member-benefits.mi']");
	public LandingPage(WebDriver driver) {		
		this.driver=driver;		
	}
	public WebElement getModule1()
	{
		return driver.findElement(module1);
	}
	public WebElement getListing()
	{
		return driver.findElement(listing);
	}
	public WebElement getCity()
	{
		return driver.findElement(city);
	}
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	public WebElement getModule2()
	{
		return driver.findElement(module2);
	}
	public WebElement getButton()
	{
		return driver.findElement(button);
	}
}
