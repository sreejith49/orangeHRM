package com.orangehrm.org.login;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.org.Core;
import com.orangehrm.org.Utilities;

public class Login extends Core{
	
	@FindBy(css="input")
	List<WebElement> listOfInput;
	
	@FindBy(css="a")
	List<WebElement> listOfAnchor;
	
	Utilities utilities = PageFactory.initElements(driver, Utilities.class);
	
	public void AccessApplication(String username, String password){
		
		utilities.inputText(listOfInput, "id", "txtUsername", username);		
		utilities.inputText(listOfInput, "id", "txtPassword", password);
		utilities.clickOnAnElementUsingGetAttribute(listOfInput, "id", "btnLogin");	
		utilities.verifyContentUsingGetText(listOfAnchor, "Welcome "+username, "Element found", "Element not found");
		
	}
	
	

}
