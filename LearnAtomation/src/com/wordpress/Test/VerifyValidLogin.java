package com.wordpress.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;
import com.wordpress.pages.LoginPageNew;

import Helper.BrowserFactory;

public class VerifyValidLogin {
	@Test
	public void checkValidUser(){
		WebDriver driver=BrowserFactory.startBrowser("firefox", "https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2Fwp-admin%2F&reauth=1");
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
		
		login_page.login_wordpress("admin", "demo123");
	}

}
