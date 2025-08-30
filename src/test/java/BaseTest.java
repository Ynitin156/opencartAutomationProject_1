import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	
  protected WebDriver driver;
  
  @BeforeMethod
  public void setup() throws IOException
  {
//	  WebDriverManager.chromedriver().setup();
	//  driver = new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=history");
	  
	  ConfigReader conR = new ConfigReader();
	  
	  String browser = conR.getBrowser();
	  String url = conR.getBaseUrl();
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		 driver = new ChromeDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.get(url);
	  
  }
  
  @AfterMethod
  public void teardown()
  {
	  if(driver != null)
	  {
		  driver.quit();
	  }
  }
  
}
