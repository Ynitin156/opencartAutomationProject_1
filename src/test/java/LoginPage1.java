import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 
{
  private WebDriver driver;
  
  private By emailid = By.xpath("//input[@id='email']");
  private By emailpass = By.xpath("//input[@type='password']");
  private By emailsubmit = By.xpath("//button[@id='SubmitLogin']");
  
  public LoginPage1(WebDriver driver)
  {
	  this.driver=driver;
  }
  
  public void emailid(String email)
  {
	  driver.findElement(emailid).sendKeys(email);
  }
  
  public void emailpass(String pass)
  {
	  driver.findElement(emailpass).sendKeys(pass);
  }
  
  public void clicklogin()
  {
	  driver.findElement(emailsubmit).click();
  }
}
