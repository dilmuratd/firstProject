package Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Hmpage.pages;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadProperty;

public class Definition1 {
	
	WebDriver driver;
@Before

public void omar() {
	WebDriverManager.chromedriver().setup();
  driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().fullscreen();
	 
	 
	

}
	
@Given("user at  home page")
	public void user_at_home_page() {
	 
	 driver.get("https://www.uat.facebook.com/");
	}

	@When("user type first name")
	public void user_type_first_name() {
		pages umar=new pages(driver);
		umar.firstname.sendKeys(ReadProperty.getProperty("a"));
	}

	@Then("user type last name")
	public void user_type_last_name() {
		pages umar=new pages(driver);
		umar.lastname.sendKeys(ReadProperty.getProperty("b"));
	}

	@Then("user type email")
	public void user_type_email() {
		pages umar=new pages(driver);
		umar.email.sendKeys(ReadProperty.getProperty("c"));
	}

	@Then("user retype the email")
	public void user_retype_the_email() {
		pages umar=new pages(driver);
		umar.Reenter.sendKeys(ReadProperty.getProperty("e"));
	}

	@Then("user type password")
	public void user_type_password() {
		pages umar=new pages(driver);
		umar.password.sendKeys(ReadProperty.getProperty("d3"));
	}

	@Then("user click on gender")
	public void user_click_on_gender() {
		pages umar=new pages(driver);
		umar.Gender.click();
	}

	@Then("user select date of birth")
	public void user_select_date_of_birth() {
		pages umar=new pages(driver);
		Select bday=new Select(umar.month);
		bday.selectByVisibleText(ReadProperty.getProperty("f"));
		Select day=new Select(umar.day);
		day.selectByVisibleText(ReadProperty.getProperty("h"));
		Select years=new Select(umar.year);
		years.selectByVisibleText(ReadProperty.getProperty("g"));
	}

	@Then("user click on sign up button")
	public void user_click_on_sign_up_button() {
	  pages umar=new pages(driver);
	  umar.sign.click();
	}
}
