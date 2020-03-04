package MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https:\\www.ndtv.com");
		driver.findElement(By.partialLinkText("OPINION")).click();

		// driver.findElement(By.xpath("//div[@class='topnav_cont']/a[@href='https://www.ndtv.com/opinion?pfrom=home-mainnavgation']")).click();
		System.out.println("Opened and clicked");

	}

}
