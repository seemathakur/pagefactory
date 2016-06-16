package Iframes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAlert {
	@Test
	public void handleAlert() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ksrtc.in/");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[8]/a/font")).click();
		Thread.sleep(5000);
		//Alert alt= driver.switchTo().alert();
		//alt.accept();
		String actul_msg=driver.switchTo().alert().getText();
		System.out.println("Alert message is "+actul_msg);
		driver.switchTo().alert().accept();
		String expected_msg="'From' place is required.";
		Assert.assertEquals(actul_msg, expected_msg);
		driver.quit();
		
	}

}
