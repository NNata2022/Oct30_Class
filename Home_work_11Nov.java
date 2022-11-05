package testing_code_Oct30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_work_11Nov {
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
				
	}
	@Test
	public void testcase1_testingURL() {
		driver.get("https://www.zara.com/us");
			}

	
	
	@Test
	public void testcase2_testingTitleandURL() {
		
		String Actualurl ="https://www.zara.com/us";
		String Expectedtitle = driver.getTitle();
		String Expectedurl = driver.getCurrentUrl();
		String Actualtitle = "ZARA United States | New Collection Online";
		
		if(Actualtitle.equals(Expectedtitle) && Actualurl.equals(Expectedurl)) {
			System.out.println("My Title is correct");
		System.out.println("My Title is Not correct");
	}
		 else{
			System.out.println("My URL is correct");
			System.out.println("My URL is NOT correct");
		}
		
		
	}
	@Test
	public void testcase3() {
		WebElement createaccount = driver.findElement(By.xpath("//span[text() = 'LOG IN']"));
		createaccount.click();
		System.out.println("Create account button is working");
	}
	@Test
	public void testcase4() {
		WebElement loginaccount = driver.findElement(By.xpath("//input[@name = 'logonId']"));
		loginaccount.sendKeys("nataliia@gmail.com");
		System.out.println("Log In Email is working ");
	}
	@Test
	public void testcase5() {
		WebElement passwordaccount = driver.findElement(By.xpath("//input[@name = 'password']"));
		passwordaccount.sendKeys("Nataliia");
		System.out.println("Log In Password is working ");
	}
	@AfterTest
	public void signin() {
		WebElement signinaccount = driver.findElement(By.xpath("//div[@class = 'zds-button__lines-wrapper']"));
				signinaccount.click();
		System.out.println("Sign In button is working ");
				
	}
	

}
