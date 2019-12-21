package mct.cucumber.steps.supportcode;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import mct.pages.CheckPriceChangePage;
import mct.pages.FooterLinks;
import mct.pages.HomePage;
import mct.pages.MyAccountPage;
import mct.pages.ProfilePage;
import mct.pages.RegPage;

public class Mct_page_loader {


	WebDriver  driver;

	// All Page Reference Coming From Page Object Model
	public HomePage homePage;
	public MyAccountPage myAccountPage;
	public RegPage regPage;
	public ProfilePage profilePage;
	public FooterLinks footerLinks;
	public CheckPriceChangePage CheckPricePage;

	public WebDriver getDriver(){

		if (driver == null){
			//driver = new ChromeDriver();
			driver = new FirefoxDriver();
		}
		return driver;		
	}


	public HomePage getHomePage() {
		if (homePage == null){
			homePage = new HomePage(driver);
		}
		return homePage;
	}

	public MyAccountPage getMyAccountPage() {
		if (myAccountPage == null){
			myAccountPage = new MyAccountPage(driver);
		}
		return myAccountPage;
	}
	public RegPage getRegPage() {
		if (regPage == null){
			regPage = new RegPage(driver);
		}
		return regPage;
	}
	public ProfilePage getProfilePage() {
		if (profilePage == null){
			profilePage = new ProfilePage(driver);
		}
		return profilePage;
	}
		public FooterLinks getFooterLink() {
			if (footerLinks == null){
				footerLinks= new FooterLinks(driver);
			}
			return footerLinks;
	}
		public CheckPriceChangePage getCheckPriceChangePage() {
			if (CheckPricePage == null){
				CheckPricePage= new CheckPriceChangePage(driver);
			}
			return CheckPricePage;
	}
}