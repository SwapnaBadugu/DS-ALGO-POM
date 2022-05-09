package dsAlgo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo.Base.TestBase;
import io.qameta.allure.Step;

public class QueuePage extends TestBase {

	@FindBy(xpath = "//h4[contains(text(),'Queue')]")
	WebElement titleQueueElement;

	@FindBy(linkText = "Implementation of Queue in Python")
	WebElement ImplementationofQueueinPythonElement;

	@FindBy(linkText = "Implementation using collections.deque")
	WebElement ImplementationusingcollectionsdequeElement;

	@FindBy(linkText = "Implementation using array")
	WebElement ImplementationusingarrayElement;

	@FindBy(linkText = "Queue Operations")
	WebElement queueOperationsElement;

	@FindBy(linkText = "Try here>>>")
	WebElement tryHereElement;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement writeTextElement;

	@FindBy(css = "button[type='button']")
	WebElement runElement;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement resultElement;

	public QueuePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@Step("getting Queue page title step....")
	public String getTitleQueue() {
		if (titleQueueElement.isDisplayed())
			return titleQueueElement.getText();
		else
			return " ";
	}

	@Step("verifying ImplementationofQueueinPython actions in QueuePage")
	public String ImplementationofQueueinPythonRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		ImplementationofQueueinPythonElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying Implementationusingcollections actions in QueuePage")
	public String ImplementationusingcollectionsRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		ImplementationusingcollectionsdequeElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying Implementationusingarray actions in QueuePage")
	public String ImplementationusingarrayRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		ImplementationusingarrayElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying queueOperations actions in QueuePage")
	public String queueOperationsRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		queueOperationsElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}
}
