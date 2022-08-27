package gettingstarted.installbrowserdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstallBrowserDriversTest {
	
	@Test
	public void chromeBrowserDriverInstallTest() {

		// Calling setup() automatically puts the correct browser driver where the code
		// will see it
		WebDriverManager.chromedriver().setup();

		// Just initialize the driver as you normally would
		WebDriver chromeDriver = new ChromeDriver();

		// The quit() method quits the driver, closing every associated window
		chromeDriver.quit();

	}

	@Test
	public void fireFoxBrowserDriverInstallTest() {

		// Calling setup() automatically puts the correct browser driver where the code
		// will see it
		WebDriverManager.firefoxdriver().setup();

		// Just initialize the driver as you normally would
		WebDriver ffDriver = new FirefoxDriver();

		// The quit() method quits the driver, closing every associated window
		ffDriver.quit();

	}

	@Test
	public void edgeBrowserDriverInstallTest() {

		// Calling setup() automatically puts the correct browser driver where the code
		// will see it
		WebDriverManager.edgedriver().setup();

		// Just initialize the driver as you normally would
		WebDriver edgeDriver = new EdgeDriver();

		// The quit() method quits the driver, closing every associated window
		edgeDriver.quit();
	}

	@Test
	public void ieBrowserDriverInstallTest() {
		// Calling setup() automatically puts the correct browser driver where the code
				// will see it
				WebDriverManager.iedriver().setup();

				// Just initialize the driver as you normally would
				WebDriver ieDriver = new InternetExplorerDriver();

				// The quit() method quits the driver, closing every associated window
				ieDriver.quit();
	}
	
}
