import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class HomePage {
	private WebDriver driver;

	private By buttonwomen = By.xpath("//a[text()='Women']");

	private By imageclick1 = By.xpath("//img[@src='http://www.automationpractice.pl/img/p/2/0/20-home_default.jpg']");

	private By iframe = By.xpath("//iframe[contains(@class,'fancybox-iframe')]");

	private By DropDown = By.xpath("//select[@id='group_1']");

	private By colordress = By.xpath("//a[@id='color_14']");

	private By addtocart = By.xpath("//span[text()='Add to cart']");

	private By processtocheckout = By.xpath("//a[contains(text(),'Proceed to Checkout')]");

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public void buttonwomen() {
		try {
			driver.findElement(buttonwomen).click();
		} catch (Exception e) {
			System.out.println("buttonwomen not working" + e.getMessage());
		}
	}

	public void imageclick1() {
		try {
			driver.findElement(imageclick1).click();
		} catch (Exception e2) {
			System.out.println("imageclick1 not working" + e2.getMessage());
		}
	}

	public void switchtoiframe() {
		try {
			WebElement frameElement = driver.findElement(iframe);
			driver.switchTo().frame(frameElement);

		} catch (Exception e3) {
			System.out.println("unable to switch frames" + e3.getMessage());
		}
	}

	public void DropDown() {
		try {
			Select s1 = new Select(driver.findElement(DropDown));
			s1.selectByIndex(1);
		} catch (Exception e4) {
			System.out.println("unable to pick dropdown" + e4.getMessage());
		}
	}

	public void addtocart() {
		try {
			if (driver.findElement(addtocart).isEnabled()) {
				driver.findElement(DropDown).click();
			} else {
				System.out.println("dropdown button is diabled ");
			}
		} catch (Exception e5) {
			System.out.println("unable to add_to_cart" + e5.getMessage());
		}
	}

}
