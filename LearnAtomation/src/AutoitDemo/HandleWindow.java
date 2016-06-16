package AutoitDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindow {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.engprod-charter.net");
		Runtime.getRuntime().exec("C:\\Users\\seema\\Desktop\\AutoItscript\\HandleAuthentication.exe");
	

	}

}
