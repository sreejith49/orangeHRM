package com.orangehrm.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Core {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void setup(){
		try {
			
			System.setProperty("webdriver.ie.driver", "./config/drivers/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver.exactpath", "D://Workspace//driver//");	
			System.setProperty("webdriver.ie.driver.silent","true");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			
			driver = new InternetExplorerDriver(capabilities);
			driver.get("http://192.168.242.190/orangehrm-3.2.1/");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
		}
	}
	
	@AfterSuite
	public void tearDown(){
		
	}

}
