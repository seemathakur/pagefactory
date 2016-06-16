package WebtableConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("txtOnwardCalendar")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='rbcal_txtOnwardCalendar']/table[1]/tbody/tr[5]/td[6]")).click();

	}

}
