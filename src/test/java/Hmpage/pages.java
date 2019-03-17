package Hmpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pages {
	public pages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")
	public WebElement firstname;

	@FindBy(name="lastname")
	public WebElement lastname;

	@FindBy(id="u_0_h")
	public WebElement email;

	@FindBy(id="u_0_o")
	public WebElement password;

	@FindBy(id="u_0_k")
	public WebElement Reenter;

	@FindBy(id="month")
	public WebElement month;

	@FindBy(name="birthday_day")
	public WebElement day;

	@FindBy(name="birthday_year")
	public WebElement year;

	@FindBy(id="u_0_a")
	public WebElement Gender;

	@FindBy(id="u_0_u")
	public WebElement sign;


}
