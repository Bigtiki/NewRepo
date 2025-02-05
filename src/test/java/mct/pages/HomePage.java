package mct.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage{

	// All Locators Or XPath for this Page  
	String loginLink = "ID:dLabellogin";
	String usernameFIeld = "ID:username";
	String passwordField = "ID:password";
	String loginButton = "ID:jqLogin";
	String signUpButton = "ID:jqSignup";
	String profileNameLabel = "Xpath://*[@id=\"dLabel\"]/span";
	String logOutLink = "Xpath://*[@id=\"drp_div\"]/ul/li/div/div[2]/a";
	String ProductCount = "Xpath://*[@class='products']";
	
	String myAccountLink = "Xpath:.//*[@id='drp_div']/ul/li/div/div[1]/a";

	

	
	// ****** Constructor -
	public HomePage(WebDriver driver) {
		super(driver); // Giving it to its master or parent calss
	}
	


	// Getter & Setters -
	public String getProfileNameLabel() {
		return getElementText(profileNameLabel);
	}
	
	// What the Page Can Do Functions 
	public void gotoHomePage() {
		// openBrowser(broowser);
		gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
	}
	
	
	public void closeBrowser() {
		// closeBrowser();  // This Becomes a Recursive Function OMG !!!
		super.closeBrowser();
	}
	
	
	public void loginTest(String user, String password) {
		clickElement(loginLink);
		typeOnElement(usernameFIeld,user);
		typeOnElement(passwordField,password);
		clickElement(loginButton);		
	}

	public void takeMetoSignUPPage() {
		clickElement(loginLink);
		clickElement(signUpButton);
	}

	public void takeMetoMyAccountPage() {
		clickElement(profileNameLabel);
		clickElement(myAccountLink);
	}
	
		
	public void logOut() {
		clickElement(profileNameLabel);
		clickElement(logOutLink);
	}
	public void getProductCount(int ExpectedProductCount) {
		getElementsText(ProductCount);
		if(getElementsText(ProductCount).size()<ExpectedProductCount) {
			System.out.println("The Product count is less than "+ExpectedProductCount
					+".\n Actual Product Count: "+
					getElementsText(ProductCount).size());}else {
						System.out.println("The Product count is more than "+ExpectedProductCount
								+".\n Actual Product Count: "+
								getElementsText(ProductCount).size());	
						}
	}

}
