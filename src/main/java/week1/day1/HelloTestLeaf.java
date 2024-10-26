package week1.day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HelloTestLeaf {
@Test
public void runHelloTestLeaf(String[] args) throws MalformedURLException {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setPlatform(Platform.LINUX);
	dc.setBrowserName("MicrosoftEdge");
	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://20.40.48.160:4444/wd/hub"), dc);
	System.out.println("Welcome to TestLeaf");
	System.out.println(new Random().nextInt(10));
	driver.close();
}
}
