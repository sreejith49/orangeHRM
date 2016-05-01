package com.orangehrm.org.dashboard;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.org.Core;
import com.orangehrm.org.Utilities;

public class Dashboard extends Core{

	@FindBy(css="a")
	List<WebElement> listOfAnchor;
	
	Utilities utilities = PageFactory.initElements(driver, Utilities.class);
		
	public void clickMainMenu(List<WebElement> elements, String menu){
		
		/*switch (menu) {
		case "Admin":
			
			utilities.clickOnAnElementUsingGetText(elements, menu);
			break;

		case "PIM":
			utilities.clickOnAnElementUsingGetText(elements, menu);
			break;
		}
		
		if(menu.equalsIgnoreCase("Admin")){
			
		}
		else if(menu.equalsIgnoreCase("PIM")){
			
		}
		else if(menu.equalsIgnoreCase("Leave")){
			
		}
		else if(menu.equalsIgnoreCase("Time")){
			
		}
		else if(menu.equalsIgnoreCase("Recruitment")){
			
		}
		else if(menu.equalsIgnoreCase("Performance")){
	
		}
		else if(menu.equalsIgnoreCase("Dashboard")){
	
		}
*/		
	}
	
	public void clickOnPimMenu(){
		utilities.clickOnAnElementUsingGetText(listOfAnchor, "PIM");
	}
}
