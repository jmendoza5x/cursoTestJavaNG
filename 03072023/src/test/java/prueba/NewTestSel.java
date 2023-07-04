package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestSel {
  @Test
  public void testSel() {
	  String executionDriverPath = "./src/test/resources/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver",executionDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
  }
}
