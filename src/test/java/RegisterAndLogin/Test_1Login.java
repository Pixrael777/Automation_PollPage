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
	public void Login() throws InterruptedException {
		
		
		 String mail = "admin@gmail.com"; 
		 System.out.println(mail);
		 driver.findElement(By.id("mat-input-5")).sendKeys(mail); 
		 
		 String pass = "1234"; 
		 System.out.println(pass);
		 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
		 
		 // Click on button Access 
		 
		 WebElement buttonAccess = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-notifications/div/div/div/div[2]/div/div/form/div/button")); 
		 buttonAccess.click();
		 System.out.println("flag0");
		 
		 Thread.sleep(3000);
		 
		 WebElement pollCreation = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[1]/div/div[1]/div/img")); 
		 
		 Boolean buttonActivatePollBoolean = pollCreation.isDisplayed();
		 System.out.println(buttonActivatePollBoolean);
		 
		 Assert.assertTrue(buttonActivatePollBoolean);
	}
	
	@Test
	 
		public void LoginMailArrobaisNotPresent() throws InterruptedException {
		
		
		 String mail = "admingmail.com"; 
		 System.out.println(mail);
		 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
		 //Thread.sleep(3000);
		 
		 String pass = "1234"; 
		 System.out.println(pass);
		 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
		 
		 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
		 System.out.println(messageError);
		 
		 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
		 
	}
	
	@Test
	 
	public void LoginMailStartWithDot() throws InterruptedException {
	
	
	 String mail = ".mysite@mysite.org"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailStartWithArroba() throws InterruptedException {
	
	
	 String mail = "@you.me.net"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailWithoutDotCom() throws InterruptedException {
	
	
	 String mail = "mysite123@gmail.b"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailThenArrobaDot() throws InterruptedException {
	
	
	 String mail = "mysite@.org.org"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailOnlyCharactersDigitUnderscoreDash() throws InterruptedException {
	
	
	 String mail = "mysite()*@gmail.com"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailDoubleDot() throws InterruptedException {
	
	
	 String mail = "mysite..1234@yahoo.com"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailOnlyLetters() throws InterruptedException {
	
	
	 String mail = "aaaaa"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailOnlyNumbers() throws InterruptedException {
	
	
	 String mail = "123445"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
		
	@Test
	 
	public void LoginMailOnlyLettersAndNumbers() throws InterruptedException {
	
	
	 String mail = "abc123445"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailOnlyCharacters() throws InterruptedException {
	
	
	 String mail = "*****"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailWithoutCom() throws InterruptedException {
	
	
	 String mail = "admin@gmail."; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailStartWithArroba2() throws InterruptedException {
	
	
	 String mail = "@gmail."; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailOnlyArrobaDotCom() throws InterruptedException {
	
	
	 String mail = "@.com"; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	@Test
	 
	public void LoginMailEmpty() throws InterruptedException {
	
	
	 String mail = ""; 
	 System.out.println(mail);
	 driver.findElement(By.id("mat-input-5")).sendKeys(mail);
	 //Thread.sleep(3000);
	 
	 String pass = "1234"; 
	 System.out.println(pass);
	 driver.findElement(By.id("mat-input-6")).sendKeys(pass);
	 
	 String messageError = driver.findElement(By.id("mat-input-5")).getAttribute("title");
	 System.out.println(messageError);
	 
	 Assert.assertEquals("It is equal","This is not a valid email" , messageError );
	 
}
	
	
	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	
}
