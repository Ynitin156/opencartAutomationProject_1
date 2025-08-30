import org.testng.annotations.Test;
import java.time.Duration;



public class Prod_Test extends BaseTest
{
	@Test
	public void Prod_Test() throws InterruptedException
	{
		//Login
		
		LoginPage1 loginpage = new LoginPage1(driver);
		loginpage.emailid("ynitin156@gmail.com");
		loginpage.emailpass("Quantum@8726");
		loginpage.clicklogin();
		
		//search_and_add_to_cart
		
		HomePage homepage = new HomePage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.buttonwomen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.imageclick1();
		
//		Thread.sleep(3000);
//		homepage.Buttonclo();
//		Thread.sleep(3000);
//		homepage.imageclick2();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.switchtoiframe();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.DropDown();
		
//		Thread.sleep(3000);
//		homepage.colordress();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.addtocart();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		homepage.closewindow();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Thread.sleep(9000);
//		homepage.processtocheckout();
		
		
				
	}
	
	
}
