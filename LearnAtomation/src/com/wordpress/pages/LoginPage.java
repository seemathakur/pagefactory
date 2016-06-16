/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author seema
 *
 */
public class LoginPage {
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath(".//*[@id='user_pass']");
	By login=By.xpath(".//*[@id='wp-submit']");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	public void loginWordpress(String userid, String pass){
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}
	public void typeUserName(String uid){
		driver.findElement(username).sendKeys(uid);
		
	}
	public void typePassword(String pass){
		driver.findElement(password).sendKeys(pass);
		
	}
	public void typeLogInButton(){
		driver.findElement(login).click();
		
	}
	
	

}
