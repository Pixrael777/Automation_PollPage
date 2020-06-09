package RegisterAndLogin;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1Login {
	WebDriver driver; 
	
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pc\\Downloads\\Programas descargados\\Driver\\Chrome\\chromedriver_win32\\chromedriver.exe");
		String url = "https://pixrael.github.io/My-Poll-Project/#/dashboard"; 
		System.out.println(url);
		driver = new ChromeDriver();
		driver.get(url);
		
		String titleLogin = driver.getTitle(); 
		System.out.println("Title login = " + titleLogin);
	}
	@Test
	public void test1() throws InterruptedException {
		String mail = "admin@gmail.com"; 
		 System.out.println(mail);
		 driver.findElement(By.id("mat-input-4")).sendKeys(mail);
		 
		 String pass = "1234"; 
		 System.out.println(pass);
		 driver.findElement(By.id("mat-input-5")).sendKeys(pass);
		 
		 // Click on button Access 
		 
		 WebElement buttonAccess = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-notifications/div/div/div/div[2]/div/div/form/div/button")); 
		 buttonAccess.click();
		 System.out.println("flag0");
		 
		 Thread.sleep(3000);
		 
		 WebElement pollCreation = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[1]/div[1]/div/div[1]/div/img")); 
		 
		 Boolean buttonActivatePollBoolean = pollCreation.isDisplayed();
		 System.out.println(buttonActivatePollBoolean);
		 
		 Assert.assertTrue(buttonActivatePollBoolean);
		 
		 
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	
}
