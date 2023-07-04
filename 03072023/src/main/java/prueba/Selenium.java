package prueba;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium {

	public static void main(String[] args) {
		String executionDriverPath = "./src/test/resources/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver",executionDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
