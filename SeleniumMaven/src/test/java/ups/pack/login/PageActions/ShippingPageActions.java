package ups.pack.login.PageActions;

import org.openqa.selenium.WebDriver;


import ups.pack.login.pageElements.ShippingPageElements;

public class ShippingPageActions {

	ShippingPageElements ShippingPageElement;

	public ShippingPageActions(WebDriver driver) {
		this.ShippingPageElement = new ShippingPageElements(driver);
	}

	public void inputnewCountry() {
		ShippingPageElement.newcountry().sendKeys("United States");
	}
	public void inputshippingName() {
		ShippingPageElement.shippingName().sendKeys("Rocky Singh");
	}
	public void inputshippingContactName() {
		ShippingPageElement.shippingContactName().sendKeys("Rocky Singh");
	}
	public void inputshippingStreetAddress() {
		ShippingPageElement.shippingStreetAddress().sendKeys("93-21");
	}
	public void inputshippingApartment() {
		ShippingPageElement.shippingApartment().sendKeys("2");
	}
	public void inputshippingDepartment() {
		ShippingPageElement.shippingDepartment().sendKeys("World");
	}
	public void inputZipCode() {
		ShippingPageElement.shippingZipCode().sendKeys("11421");
	}
	public void inputshippingCity() {
		ShippingPageElement.shippingCity().sendKeys("Woodhaven");
	}
	public void inputshippingState() {
		ShippingPageElement.shippingState().sendKeys("New York");
	}
	public void inputshippingEmail() {
		ShippingPageElement.shippingEmail().sendKeys("rockysingh5182@gmail.com");
	}
	public void inputshippingPhone() {
		ShippingPageElement.shippingPhone().sendKeys("9172914952");
	}
	public void inputshippingExtension() {
		ShippingPageElement.shippingExtension().sendKeys("122");
	}

	public void shippingContinueBtn() {
		ShippingPageElement.shippingContinueBtn().click();
	}

	public String shippingErrorMsg() {
		String errormsg = ShippingPageElement.shippingErrorMsg().getText();
		return errormsg;
	}
}
