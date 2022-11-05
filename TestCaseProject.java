package testing_code_Oct30;

import java.time.Duration;

import org.junit.Test;
import org.openga.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseProject {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	
	@Test
	public void setUp() {
		driver.get("https://www.facebook.com/");
		System.out.println("The title of this page is : " + driver.getTitle());
	}
	
	@Test
	public void clickOnSignInLink() {
		driver.findElement(By.id("u_0_5_wT"))
	}

}
