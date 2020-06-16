package RegisterAndLogin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test2_failInOtherProject {
	WebDriver driver; 
	
	@Before 
	public void before() {
System.out.println("FlagBefore");
		
		String urlPage = "https://smartbytes.v-logics.com/ocart/index.php?route=account/register";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\Programas descargados\\Driver\\Chrome\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
		driver.get(urlPage);
	}
	
	
	@Test
	public void test() {
		String titleCurrently = driver.getTitle();
		System.out.println("Title of page is: " +  titleCurrently); 
		
		
		
	}
	
	@After
	public void afer() {}

}
