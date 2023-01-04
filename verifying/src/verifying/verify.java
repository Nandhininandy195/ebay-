package verifying;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify {
	
	
	//@Test(verifytitle = 0) 
	public void verifytitle() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "G:\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/v4/");
	
	// Enters the use name and password
	
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr467919");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qyvanyd");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	Thread.sleep(2000);

	//Getting  actual page title
	
	String Act_Title=driver.getTitle();
	System.out.println("actual title"+Act_Title);
	
	// Expected page Title
	String exp_Title="";
	
	//verifying the page title
	Assert.assertequals(Act_Title,exp_Title);
	System.out.println("Test Completed");
	
	
	driver.quit();

}
}
