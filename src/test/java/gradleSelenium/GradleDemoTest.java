package gradleSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GradleDemoTest {
	
	WebDriver driver;
	
	@Test
	public void testingGradle() {
		String os = System.getProperty("os.name");
		  if (os.contains("Mac"))
              System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/bin/chromedriver");
          else if (os.contains("Windows"))
              System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/bin/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google", "Title not matched");
		driver.quit();
		
	}

}
