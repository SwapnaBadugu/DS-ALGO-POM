package dsAlgo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo.Base.TestBase;
import io.qameta.allure.Step;

public class StackPage extends TestBase {
	@FindBy(xpath = "//h4[contains(text(),'Stack')]")
	WebElement titleStackElement;

	@FindBy(linkText = "Operations in Stack")
	WebElement operationsinStackElement;

	@FindBy(linkText = "Implementation")
	WebElement implementationElement;

	@FindBy(linkText = "Applications")
	WebElement applicationsElement;

	@FindBy(linkText = "Try here>>>")
	WebElement tryHereElement;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement writeTextElement;

	@FindBy(css = "button[type='button']")
	WebElement runElement;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement resultElement;

	public StackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@Step("getting Stack page title step....")
	public String getTitleStack() {
		if (titleStackElement.isDisplayed())
			return titleStackElement.getText();
		else
			return " ";
	}

	@Step("verifying operationsinStack actions in StackPage")

	public String operationsinStackRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		operationsinStackElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying implementation actions in StackPage")

	public String implementationRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		implementationElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying applications actions in StackPage")

	public String applicationsRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		applicationsElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

}
