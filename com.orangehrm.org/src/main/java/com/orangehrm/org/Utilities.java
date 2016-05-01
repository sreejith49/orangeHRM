package com.orangehrm.org;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Utilities extends Core{
	
	/*This function will loop inside a list of elements and identifies matching element 
	and executes a click on it*/
	public void clickOnAnElement(List<WebElement> elements, String attribute, String expectedValue){
		
		try {
			
			for(WebElement element : elements){
				
				if(element.getAttribute(attribute).equalsIgnoreCase(expectedValue)){
					element.click();
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*This function will help to assert certain text, elements, element values etc*/
	public void verifyContent(List<WebElement> elements, String attribute, String expectedValue, String successMessage, String failureMessage){
		
		try {
			
			for(WebElement element : elements){
				
				if(element.getAttribute(attribute).equalsIgnoreCase(expectedValue)){
					System.out.println(successMessage);
				}else{
					System.out.println(failureMessage);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*This function will help to enter text in a textbox by looping in a list of elements*/
	public void inputText(List<WebElement> elements, String attribute, String expectedValue, String textToEnter){
		
		try {
			
			for(WebElement element : elements){
				
				if(element.getAttribute(attribute).equalsIgnoreCase(expectedValue)){
					element.sendKeys(textToEnter);
				}else{
					System.out.println("Element not found");
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
