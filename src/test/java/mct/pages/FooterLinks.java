package mct.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

public class FooterLinks extends MasterPage{
	public FooterLinks(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	String FooterLinks= "Xpath://section[@class='footersep']//a";
	
	
	
	public List<String> getAllOptions() {
		List<String> actualResultList = new ArrayList<>();
		actualResultList = getElementsText(FooterLinks);
		
		
		// Get the Locators Of all the Option And Return the Text in All Options Back 
		return actualResultList;
}
}