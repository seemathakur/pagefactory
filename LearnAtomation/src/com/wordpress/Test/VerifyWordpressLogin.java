package com.wordpress.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

public class VerifyWordpressLogin {
	@Test
	public void VerifyValidLogin(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2Fwp-admin%2F&reauth=1");
		LoginPage login=new LoginPage(driver);
		login.typeUserName("admin");
		login.typePassword("demo123");
		login.typeLogInButton();
		driver.quit();
		
		
		
		
	}

}
