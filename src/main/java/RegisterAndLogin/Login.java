package RegisterAndLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		//Task: open www.google.com in  browser 
		String url = "https://pixrael.github.io/My-Poll-Project/#/dashboard"; 
		System.out.println(url);
		
		//Register 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\Programas descargados\\Driver\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		//Open www.google.com 
		 WebDriver driver = new ChromeDriver(); 
		
		//Open 
		 driver.get(url);
		 
		 //Verify title 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 String titleWeb = "Material Dashboard Angular by Creative Tim"; 
		 
		 if(title.equals(titleWeb)) {
			 System.out.println("Title passed");
			 
		 } else {
			 System.out.println("Title fail");
		 } 
		 
		 
		 
		 // Writte mail and login
		 String mail = "admin@gmail.com"; 
		 System.out.println(mail);
		 driver.findElement(By.id("mat-input-4")).sendKeys(mail);
		 
		 String pass = "1234"; 
		 System.out.println(pass);
		 driver.findElement(By.id("mat-input-5")).sendKeys(pass);
		 
		 // Click on button Access 
		 
		 WebElement buttonAccess = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-notifications/div/div/div/div[2]/div/div/form/div/button")); 
		 buttonAccess.click();
	}
	
}
