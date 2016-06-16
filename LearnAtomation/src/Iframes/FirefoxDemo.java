package Iframes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FirefoxDemo {
	@Test
	public void handleCertificate(){
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver=new FirefoxDriver(cap);
		driver.get("https://www.cacert.org/");
		
	}

}
