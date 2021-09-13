package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{	
	prop= new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Hotel\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println("Chrome");
	if(browserName.equals("chrome"))
	{
	   System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
	   driver= new ChromeDriver();	
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
}
