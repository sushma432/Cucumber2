package Report;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Report.ExtentReportManager.class)
public class Guru99 {
	WebDriver  driver;
	@Test
	void OpenApp()
	{
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	@Test(priority=1)
	void login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr529637");
		driver.findElement(By.name("password")).sendKeys("YdygUmy");
		driver.findElement(By.name("btnLogin")).click();
	
		
	}
	@Test(priority=2,dependsOnMethods="OpenApp")
	void TearDown()
	{
		driver.close();
	}
	}



