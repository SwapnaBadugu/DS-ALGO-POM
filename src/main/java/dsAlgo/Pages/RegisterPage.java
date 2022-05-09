package dsAlgo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo.Base.TestBase;

public class RegisterPage extends TestBase {

	@FindBy(linkText = "NumpyNinja")
	WebElement ValidateText;

	@FindBy(linkText = " Register ")
	WebElement Register;

	@FindBy(xpath = "//input[@id='id_username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password1;

	@FindBy(xpath = "//input[@id='id_password1']")
	WebElement password2;
	

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public String ValidateText() {
		return driver.getTitle();
	}

	public SignPage Register(String un, String pwd, String pwd1) {
		Register.click();
		username.sendKeys(un);
		password1.sendKeys(pwd);
		password2.sendKeys(pwd1);
		Register.click();
		return new SignPage(driver);

	}

}
