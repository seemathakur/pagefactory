package Iframes;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowSwitchDemo {
	@Test
	public void swichChildWindow() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parent_window=driver.getWindowHandle();
		System.out.println("Before swiching title is "+driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='TosLink']")).click();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext()){
			String child_window=i1.next();
			if(!parent_window.equalsIgnoreCase(child_window)){
				driver.switchTo().window(child_window);
				Thread.sleep(10000);
				System.out.println("After swiching title is"+driver.getTitle());
				driver.close();
				
				
			}
			
		}
		driver.switchTo().window(parent_window);
		System.out.println("Back to parent window "+driver.getTitle());
		
		
		
		
	}

}
