package ups.pack.testRunner;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.ShippingPageActions;


public class UpsShippingTest extends BaseDriverClass {

	WebDriver driver = getChromeDriver();
	ShippingPageActions shippingAction = new ShippingPageActions(driver);

	@BeforeTest
	public void beforeTestMethod() {
		driver.get("https://www.ups.com/ship/guided/origin?tx=5614715613706317&loc=en_US");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void shippingTest() {
		shippingAction.inputnewCountry();
		shippingAction.inputshippingName();
		shippingAction.inputshippingContactName();
		shippingAction.inputshippingStreetAddress();
		shippingAction.inputshippingApartment();
		shippingAction.inputshippingApartment();
		shippingAction.inputZipCode();
		shippingAction.inputshippingCity();
		shippingAction.inputshippingState();
		shippingAction.inputshippingEmail();
		shippingAction.inputshippingPhone();
		shippingAction.inputshippingExtension();
		//shippingAction.ShippingContinue();
		//String actualErrorMsg = shippingAction.getshippingErrorMsg();

		/*
		 * if (actualErrorMsg.contains("not valid")) { System.out.println("PASSED!"); }
		 * else { System.out.println("FAILED"); fail(); }
		 */

	}
	
	@AfterTest
	public void afterTestMethod(){
		System.out.println(">> Closing Driver");
		driver.close();
	}

}