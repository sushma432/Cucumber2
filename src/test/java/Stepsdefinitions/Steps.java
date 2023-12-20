package Stepsdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver; 
	@Given("Opne Chorme Browser")
	 void opne_chorme_browser() {
	    driver= new EdgeDriver();
	}

	@Given("Open URL {string}")
      void open_url(String string) {
	    driver.get("https://www.demo.guru99.com/v4");
	}

	@When("Login ID Login Password")
	void login_id_login_password() {
	   driver.findElement(By.name("uid")).sendKeys("mngr512103");
	   driver.findElement(By.name("Password")).sendKeys("ahUdAsA");
	}

	@And("Click on Submit")
	void click_on_submit() {
	    driver.findElement(By.name("btnLogin")).click();
	}

	@Then("Redirect to Bankpage")
     void redirect_to_bankpage() {
	   WebElement Image=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee"));
	   if(Image.isDisplayed())
		{
		System.out.println("Login Success");
		}
		else
		{
		System.out.println("Login Failed");
		}
		}

	}


