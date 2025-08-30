import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;



public class HomePage 
{
	private WebDriver driver;
	
	private By buttonwomen = By.xpath("//a[text()='Women']");
	private By imageclick1 = By.xpath("//img[@src='http://www.automationpractice.pl/img/p/2/0/20-home_default.jpg']");
	//private By Buttonclo = By.xpath("//a[@title='Close']");
	
	//private By imageclick2 = By.xpath("//img[@src='http://www.automationpractice.pl/img/p/2/0/20-home_default.jpg']");
	
	private By iframe = By.xpath("//iframe[contains(@class,'fancybox-iframe')]");
	
	private By DropDown = By.xpath("//select[@id='group_1']");
	
	private By colordress = By.xpath("//a[@id='color_14']");
	
	private By addtocart = By.xpath("//span[text()='Add to cart']");
	
	//private By closewindow = By.xpath("//span[@title='Close window']");
	
	private By processtocheckout = By.xpath("//a[contains(text(),'Proceed to Checkout')]");
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void buttonwomen()
	{
		driver.findElement(buttonwomen).click();
	}
	
	public void imageclick1()
	{
		driver.findElement(imageclick1).click();
	}
	
	
//	public void Buttonclo() 
//	{
//		
//		driver.findElement(Buttonclo).click();
//	}

	
	public void switchtoiframe()
	{
	try
	{
	  WebElement frameElement = driver.findElement(iframe);
	  driver.switchTo().frame(frameElement);
	  
	}
	catch(Exception e1)
	{
		System.out.println("unable to switch frames" +e1.getMessage());
	}
	}
		
	
		public void DropDown()
		{
		try
		{
			Select s1 = new Select(driver.findElement(DropDown)); 
			s1.selectByIndex(1);
		}
		catch(Exception e2)
		{
			System.out.println("unable to pick dropdown" +e2.getMessage());
		}
	}
	
	
//    public void colordress()
//	{
//		driver.findElement(colordress).click();
//	}
	
	public void addtocart()
	{
		driver.findElement(addtocart).click();
	}
	
	//public void closewindow()
//	{
//	   try
//	   
//	   {
//		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		   WebElement clsbttn = driver.findElement(closewindow);
//		   
//		   Actions ac1 = new Actions(driver);
//		   ac1.moveToElement(clsbttn).click().build().perform();
//		   //clsbttn.click();
//		   System.out.println("Window closed successfully");
//		   
//	   }
//	   catch(Exception e4)
//	   {
//		   System.out.println("unable to close " +e4.getMessage());
//	   }
//	}
	
	
//	public void processtocheckout()
//	{
//		try
//		{
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'fancybox-iframe')]")));
//			WebElement chkoutbttn = driver.findElement(processtocheckout);
//			Actions act = new Actions(driver);
//			act.moveToElement(chkoutbttn).click().perform();
//			chkoutbttn.click();
//			
//			WebElement proceedBtn = driver.findElement(processtocheckout);
//			((JavascriptExecutor) driver).executeScript("arguments[0].click();", processtocheckout);
//			
//		}
//		catch(Exception e3)
//	{
//		System.out.println("process to Checkout not working "+e3.getMessage());
//	}
//		
//	}
	
}
