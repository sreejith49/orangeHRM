package com.orangehrm.org.login;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orangehrm.org.Core;

public class LoginTestSuite extends Core{
			
	@Test
	public void testLogin(){
		try {
			
			Login login = PageFactory.initElements(driver, Login.class);
			login.AccessApplication("Admin", "Password01");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
