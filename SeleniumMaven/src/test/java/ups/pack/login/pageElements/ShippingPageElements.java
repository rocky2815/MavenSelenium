package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingPageElements {

	
	WebDriver driver;

	public ShippingPageElements(WebDriver driver) {
		this.driver = driver;
		}
		
		public WebElement newcountry() {
			Select newcountry = new Select(driver.findElement(By.name("origincountry")));
			newcountry.selectByVisibleText("United States");
			return newcountry();
		}
		
			
		
		public WebElement shippingName() {
			WebElement shippingName = driver.findElement(By.name("organization"));
			return shippingName;
		}
		public WebElement shippingContactName() {
			WebElement shippingContactName = driver.findElement(By.name("organization"));
			return shippingContactName;
		}
		public WebElement shippingStreetAddress() {
			WebElement shippingStreetAddress = driver.findElement(By.name("originaddress1"));
			return shippingStreetAddress;
		}
		public WebElement shippingApartment() {
			WebElement shippingApartment = driver.findElement(By.name("originaddress2"));
			return shippingApartment;
		}
		public WebElement shippingDepartment() {
			WebElement shippingDepartment = driver.findElement(By.name("originaddress3"));
			return shippingDepartment;
		}
		
		public WebElement shippingZipCode() {
			WebElement shippingZipCode = driver.findElement(By.name("originpostal"));
			return shippingZipCode;
		}
		public WebElement shippingCity() {
			WebElement shippingCity = driver.findElement(By.name("origincity"));
			return shippingCity;
		}
		public WebElement shippingState() {
			WebElement shippingState = driver.findElement(By.name("originstate"));
			return shippingState;
		}
		public WebElement shippingEmail() {
			WebElement shippingEmail = driver.findElement(By.name("originemail"));
			return shippingEmail;
		}
		public WebElement shippingPhone() {
			WebElement shippingPhone = driver.findElement(By.name("originphone"));
			return shippingPhone;
		}
		public WebElement shippingExtension() {
			WebElement shippingExtension = driver.findElement(By.name("originextension"));
			return shippingExtension;
		}
		public WebElement shippingContinueBtn() {
			WebElement shippingContinueBtn = driver.findElement(By.id("nbsBackForwardNavigationContinueButton"));
			return shippingContinueBtn;
		}
		public WebElement shippingErrorMsg() {
			WebElement shippingErrorMsg = driver.findElement(By.id("stApp_statusErrorText"));
			return shippingErrorMsg;
		}
		
		
		
		}


