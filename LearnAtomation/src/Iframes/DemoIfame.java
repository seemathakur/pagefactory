package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoIfame {
	@Test
	public void testframe(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.raza.com/");
		int total_frames= driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total framrs in application is " + total_frames);
		/*WebElement my_frame= driver.findElement(By.xpath("//iframe[@title='Text Resize Monitor']"));
		driver.switchTo().frame(my_frame);
		driver.findElement(By.xpath(".//*[@id='clickcopyimgDAD85']")).click();
		
		/*driver.switchTo().frame("yuiResizeMonitor");
		driver.findElement(By.xpath(".//*[@id='flexLabel_1']/a")).click();
		driver.findElement(By.xpath(".//*[@id='Flyout_1']/div/div[2]/ul[1]/li[1]/label")).sendKeys("Men's Shoes");
		driver.switchTo().defaultContent();*/
		
		
		
		
	}

}
