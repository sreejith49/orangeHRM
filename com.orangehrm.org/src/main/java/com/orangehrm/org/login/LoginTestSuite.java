package com.orangehrm.org.login;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orangehrm.org.Core;

public class LoginTestSuite extends Core{
	
	Login login = PageFactory.initElements(driver, Login.class);
	
	@Test
	public void testLogin(){
		login.AccessApplication("Admin", "Password01");
	}

}
