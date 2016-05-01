package com.orangehrm.org;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Utilities extends Core{
	
	/*This function will loop inside a list of elements and identifies matching element 
	and executes a click on it*/
	public void clickOnAnElementUsingGetAttribute(List<WebElement> elements, String attribute, String expectedValue){
		
		try {
			
			for(WebElement element : elements){
				
				if(element.getAttribute(attribute).equalsIgnoreCase(expectedValue)){
					element.click();
					break;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*This function will loop inside a list of elements and identifies matching element 
	and executes a click on it*/
	public void clickOnAnElementUsingGetText(List<WebElement> elements, String expectedValue){
		
		try {
			
			for(WebElement element : elements){
				
				if(element.getText().equalsIgnoreCase(expectedValue)){
					element.click();
					break;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	/*This function will help to assert certain text, elements, element values etc*/
	public void verifyContentUsingGetAttribute(List<WebElement> elements, String attribute, String expectedValue, String successMessage, String failureMessage){
		
		try {
			String status = failureMessage;
			for(WebElement element : elements){
				
				if(element.getAttribute(attribute).equalsIgnoreCase(expectedValue)){
					status = successMessage;
					break;
				}
				
			}
			
			System.out.println(status);
			
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
					break;
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*This function will help to assert certain text, elements, element values etc using getText*/
	public void verifyContentUsingGetText(List<WebElement> elements, String expectedValue, String successMessage, String failureMessage){
		
		try {
			String status = failureMessage;
			for(WebElement element : elements){
				
				if(element.getText().equalsIgnoreCase(expectedValue)){
					status = successMessage;
					break;
				}
				
			}
			
			System.out.println(status);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
