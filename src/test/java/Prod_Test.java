import org.testng.annotations.Test;
import java.time.Duration;



public class Prod_Test extends BaseTest
{
	@Test(groups = {"smoke"})
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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.switchtoiframe();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.DropDown();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.addtocart();
		

		
				
	}
	
	
}
