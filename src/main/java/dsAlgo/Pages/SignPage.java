package dsAlgo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class SignPage { // extends BasePage

	WebDriver driver;

	// Page Factory/Object Repositories

	WebDriver webdriver;

	@FindBy(linkText = "Sign in")
	WebElement Signin;

	@FindBy(xpath = "//input[@id='id_username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbutton;

	@FindBy(linkText = "NumpyNinja")
	WebElement ValidateText;

	public SignPage(WebDriver driver) {

		// super(driver);

		webdriver = driver;
		PageFactory.initElements(driver, this);
	}

	@Step("getting Signin page title step....")
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	@Step("login with username: {0} and password: {1} step...")
	public HomePage Login(String un, String pwd) {
		Signin.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();

		return new HomePage(webdriver);
	}

}