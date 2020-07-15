package CreateAPoll;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAPoll {

	WebDriver driver;

	@Before
	public void setUp() throws InterruptedException {

		System.out.println("Flag1");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pc\\Downloads\\Programas descargados\\Driver\\Chrome\\chromedriver_win32\\chromedriver.exe");

		String url = "https://pixrael.github.io/My-Poll-Project/#/dashboard";
		driver = new ChromeDriver();
		driver.get(url);

		String mail = "admin@gmail.com";
		driver.findElement(By.id("mat-input-5")).sendKeys(mail);

		String pass = "1234";
		driver.findElement(By.id("mat-input-6")).sendKeys(pass);

		WebElement buttonAccess = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-notifications/div/div/div/div[2]/div/div/form/div/button"));
		buttonAccess.click();

		driver.manage().window().maximize();
		Thread.sleep(3000);

		Assert.assertTrue(true);

	}

	@Test

	// First test = Enable button Create a Poll
	// 1. Write on field Name a poll
	// 2. Upload 2 images
	// 3. Click on button Create a Poll

	public void CreateAPoolPositive_2ImgNameCorrect() throws InterruptedException {

		// 2. Upload 2 images

		WebElement upLoadImage1 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[1]/div/div[2]/label/input"));
		upLoadImage1.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\imagen1_JPG.jpg");

		WebElement upLoadImage2 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[2]/div/div[2]/label/input"));
		upLoadImage2.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\image2.webp");

		// 3. Verify if enable or disable button Create a Poll
		WebElement buttonCreatePoll = driver.findElement(By
				.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[3]/div/div/button"));

		System.out.println("Before click");

		// 1. Write on field Name a poll

		String NameAPoll = "This is my name for poll\t";
		WebElement inputNamePoll = driver.findElement(By.id("mat-input-7"));
		inputNamePoll.sendKeys(NameAPoll);

		Boolean buttonEnable = buttonCreatePoll.isEnabled();
		System.out.println("The button is " + buttonEnable);

		// Thread.sleep(3000);

		System.out.println("Here button must is enable");

		Assert.assertTrue(buttonEnable);

		// expected result: the button is enabled
		// search the button
		// check the disable property is false
		// Steps that makes the button be enabled

	}

	@Test
	public void CreateAPoolNegative_0ImgNameCorrect() throws InterruptedException {

		// 1. Upload 0 images

		// 2. Verify if enable or disable button Create a Poll
		WebElement buttonCreatePoll = driver.findElement(By
				.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[3]/div/div/button"));

		System.out.println("Before click");

		// 3. Write on field Name a poll

		String NameAPoll = "This is my name for poll\t";
		WebElement inputNamePoll = driver.findElement(By.id("mat-input-7"));
		inputNamePoll.sendKeys(NameAPoll);

		// 4. Verify if button is enable

		Boolean buttonEnable = buttonCreatePoll.isEnabled();
		System.out.println("The button is enable = " + buttonEnable);

		System.out.println("Here button must isn`t enable");

		Assert.assertFalse(buttonEnable);
	}

	@Test
	public void CreateAPoolNegative_1ImgNameCorrect() throws InterruptedException {

		// 1. Upload 1 images
		WebElement upLoadImage1 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[1]/div/div[2]/label/input"));
		upLoadImage1.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\imagen1_JPG.jpg");

		// 2. Verify if enable or disable button Create a Poll
		WebElement buttonCreatePoll = driver.findElement(By
				.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[3]/div/div/button"));

		System.out.println("Before click");

		// 3. Write on field Name a poll

		String NameAPoll = "This is my name for poll\t";
		WebElement inputNamePoll = driver.findElement(By.id("mat-input-7"));
		inputNamePoll.sendKeys(NameAPoll);

		// 4. Verify if button is enable

		Boolean buttonEnable = buttonCreatePoll.isEnabled();
		System.out.println("The button is enable = " + buttonEnable);

		System.out.println("Here button must isn`t enable");

		Assert.assertFalse(buttonEnable);
	}

	@Test
	public void CreateAPoolNegative_2Img_NameInCorrectWith4Character() throws InterruptedException {

		// 1. Upload 1 images
		WebElement upLoadImage1 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[1]/div/div[2]/label/input"));
		upLoadImage1.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\imagen1_JPG.jpg");

		WebElement upLoadImage2 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[2]/div/div[2]/label/input"));
		upLoadImage2.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\image2.webp");
		
		
		// 2. Verify if enable or disable button Create a Poll
		WebElement buttonCreatePoll = driver.findElement(By
				.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[3]/div/div/button"));

		System.out.println("Before click");

		// 3. Write on field Name a poll

		String NameAPoll = "Four\t";
		WebElement inputNamePoll = driver.findElement(By.id("mat-input-7"));
		inputNamePoll.sendKeys(NameAPoll);

		// 4. Verify if button is enable

		Boolean buttonEnable = buttonCreatePoll.isEnabled();
		System.out.println("The button is enable = " + buttonEnable);

		System.out.println("Here button must isn`t enable");

		Assert.assertFalse(buttonEnable);
	}
	
	@Test
	public void CreateAPoolPositive_2Img_NameInCorrectWith39Character() throws InterruptedException {

		// 1. Upload 1 images
		WebElement upLoadImage1 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[1]/div/div[2]/label/input"));
		upLoadImage1.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\imagen1_JPG.jpg");

		WebElement upLoadImage2 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[2]/div/div[2]/label/input"));
		upLoadImage2.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\image2.webp");
		
		
		// 2. Verify if enable or disable button Create a Poll
		WebElement buttonCreatePoll = driver.findElement(By
				.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[3]/div/div/button"));

		System.out.println("Before click");

		// 3. Write on field Name a poll

		String NameAPoll = "This is a test of 39 characters 1234567\t";
		WebElement inputNamePoll = driver.findElement(By.id("mat-input-7"));
		inputNamePoll.sendKeys(NameAPoll);

		// 4. Verify if button is enable

		Boolean buttonEnable = buttonCreatePoll.isEnabled();
		System.out.println("The button is enable = " + buttonEnable);

		System.out.println("Here button must is enable");

		Assert.assertTrue(buttonEnable);
	}

	@Test
	public void CreateAPoolPositive_2Img_NameInCorrectWith40Character() throws InterruptedException {

		// 1. Upload 1 images
		WebElement upLoadImage1 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[1]/div/div[2]/label/input"));
		upLoadImage1.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\imagen1_JPG.jpg");

		WebElement upLoadImage2 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[2]/div/div[2]/label/input"));
		upLoadImage2.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\image2.webp");
		
		
		// 2. Verify if enable or disable button Create a Poll
		WebElement buttonCreatePoll = driver.findElement(By
				.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[3]/div/div/button"));

		System.out.println("Before click");

		// 3. Write on field Name a poll

		String NameAPoll = "This is a test of 40 characters 12345678\t";
		WebElement inputNamePoll = driver.findElement(By.id("mat-input-7"));
		inputNamePoll.sendKeys(NameAPoll);

		// 4. Verify if button is enable

		Boolean buttonEnable = buttonCreatePoll.isEnabled();
		System.out.println("The button is enable = " + buttonEnable);

		System.out.println("Here button must is enable");

		Assert.assertTrue(buttonEnable);
	}

	@Test
	public void CreateAPoolNegative_2Img_NameInCorrectWith41Character() throws InterruptedException {

		// 1. Upload 1 images
		WebElement upLoadImage1 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[1]/div/div[2]/label/input"));
		upLoadImage1.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\imagen1_JPG.jpg");

		WebElement upLoadImage2 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[2]/div/div[2]/label/input"));
		upLoadImage2.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\image2.webp");
		
		
		// 2. Verify if enable or disable button Create a Poll
		WebElement buttonCreatePoll = driver.findElement(By
				.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[3]/div/div/button"));

		System.out.println("Before click");

		// 3. Write on field Name a poll

		String NameAPoll = "This is a test of 41 characters 123456789\t";
		WebElement inputNamePoll = driver.findElement(By.id("mat-input-7"));
		inputNamePoll.sendKeys(NameAPoll);

		// 4. Verify if button is enable

		Boolean buttonEnable = buttonCreatePoll.isEnabled();
		System.out.println("The button is enable = " + buttonEnable);

		System.out.println("Here button must isn`t enable");

		Assert.assertFalse(buttonEnable);
	}

	@Test
	public void CreateAPoolNegative_2Img_NameInCorrect_StartNumber() throws InterruptedException {

		// 1. Upload 1 images
		WebElement upLoadImage1 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[1]/div/div[2]/label/input"));
		upLoadImage1.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\imagen1_JPG.jpg");

		WebElement upLoadImage2 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[2]/div/div[2]/label/input"));
		upLoadImage2.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\image2.webp");
		
		
		// 2. Verify if enable or disable button Create a Poll
		WebElement buttonCreatePoll = driver.findElement(By
				.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[3]/div/div/button"));

		System.out.println("Before click");

		// 3. Write on field Name a poll

		String NameAPoll = "1 My poll\t";
		WebElement inputNamePoll = driver.findElement(By.id("mat-input-7"));
		inputNamePoll.sendKeys(NameAPoll);

		// 4. Verify if button is enable

		Boolean buttonEnable = buttonCreatePoll.isEnabled();
		System.out.println("The button is enable = " + buttonEnable);

		System.out.println("Here button must isn`t enable");

		Assert.assertFalse(buttonEnable);
	}

	@Test
	public void CreateAPoolNegative_2Img_NameInCorrect_StartCharacter() throws InterruptedException {

		// 1. Upload 1 images
		WebElement upLoadImage1 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[1]/div/div[2]/label/input"));
		upLoadImage1.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\imagen1_JPG.jpg");

		WebElement upLoadImage2 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[2]/div/div[2]/label/input"));
		upLoadImage2.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\image2.webp");
		
		
		// 2. Verify if enable or disable button Create a Poll
		WebElement buttonCreatePoll = driver.findElement(By
				.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[3]/div/div/button"));

		System.out.println("Before click");

		// 3. Write on field Name a poll

		String NameAPoll = "@1 My poll\t";
		WebElement inputNamePoll = driver.findElement(By.id("mat-input-7"));
		inputNamePoll.sendKeys(NameAPoll);

		// 4. Verify if button is enable

		Boolean buttonEnable = buttonCreatePoll.isEnabled();
		System.out.println("The button is enable = " + buttonEnable);

		System.out.println("Here button must isn`t enable");

		Assert.assertFalse(buttonEnable);
	}

	@Test
	public void CreateAPoolNegative_2Img_NameInCorrect_Empty() throws InterruptedException {

		// 1. Upload 1 images
		WebElement upLoadImage1 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[1]/div/div[2]/label/input"));
		upLoadImage1.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\imagen1_JPG.jpg");

		WebElement upLoadImage2 = driver.findElement(By.xpath(
				"/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[2]/div[2]/div/div[2]/label/input"));
		upLoadImage2.sendKeys("C:\\Users\\pc\\Downloads\\Projects Data\\image2.webp");
		
		
		// 2. Verify if enable or disable button Create a Poll
		WebElement buttonCreatePoll = driver.findElement(By
				.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-dashboard/div/div/div[3]/div/div/button"));

		System.out.println("Before click");

		// 3. Write on field Name a poll

		String NameAPoll = "";
		WebElement inputNamePoll = driver.findElement(By.id("mat-input-7"));
		inputNamePoll.sendKeys(NameAPoll);

		// 4. Verify if button is enable

		Boolean buttonEnable = buttonCreatePoll.isEnabled();
		System.out.println("The button is enable = " + buttonEnable);

		System.out.println("Here button must isn`t enable");

		Assert.assertFalse(buttonEnable);
	}


	
	@After
	public void End() {
		driver.close();
		System.out.println("Flag3");

	}

}
