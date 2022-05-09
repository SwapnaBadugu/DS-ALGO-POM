package dsAlgo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo.Base.TestBase;
import io.qameta.allure.Step;

public class ArrayPage extends TestBase {

	@FindBy(xpath = "//h4[contains(text(),'Array')]")
	WebElement titleArrayElement;

	@FindBy(xpath = "//p[contains(text(),'Arrays in Python')]")
	WebElement titleArrayinPythonElement;

	@FindBy(xpath = "//p[contains(text(),'Basic Operations in Lists')]")
	WebElement titleBasicOpertaionsinListElement;

	@FindBy(xpath = "//p[contains(text(),'Applications of Array')]")
	WebElement titleApplicationsofArrayElement;

	@FindBy(xpath = "//p[contains(text(),'Arrays Using List')]")
	WebElement titleArrayusingListElement;

	@FindBy(linkText = "Arrays in Python")
	WebElement arraysinPythonElement;

	@FindBy(linkText = "Try here>>>")
	WebElement tryHereElement;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement writeTextElement;

	@FindBy(css = "button[type='button']")
	WebElement runElement;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement resultElement;

	@FindBy(linkText = "Arrays Using List")
	WebElement arrayUsingListElement;

	@FindBy(linkText = "Basic Operations in Lists")
	WebElement basicOperationsinListsElement;

	@FindBy(linkText = "Applications of Array")
	WebElement applicationsofArrayElement;

	public ArrayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@Step("getting Array page title step....")
	public String getTitleArray() {
		if (titleArrayElement.isDisplayed())
			return titleArrayElement.getText();
		else
			return " ";
	}

	@Step("getting TitleArrayinpython page title step....")
	public String getTitleArrayinpython() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		arraysinPythonElement.click();
		if (titleArrayinPythonElement.isDisplayed())
			return titleArrayinPythonElement.getText();
		else
			return " ";
	}

	@Step("verifying ArraysinPython actions in ArrayPage")
	public String ArraysinPythonRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		arraysinPythonElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("getting TitleArrayusingList page title step....")
	public String getTitleArrayusingList() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		arrayUsingListElement.click();
		if (titleArrayusingListElement.isDisplayed())
			return titleArrayusingListElement.getText();
		else
			return " ";
	}

	@Step("verifying ArrayusingLis actions in ArrayPage")

	public String ArrayusingListRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");

		arraysinPythonElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("getting TitleBasicOpertaionsinList page title step....")
	public String getTitleBasicOpertaionsinList() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		basicOperationsinListsElement.click();
		if (titleBasicOpertaionsinListElement.isDisplayed())
			return titleBasicOpertaionsinListElement.getText();
		else
			return " ";
	}

	@Step("verifying BasicOpertaionsinList actions in ArrayPage")

	public String BasicOpertaionsinListRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");

		basicOperationsinListsElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("getting TitleApplicationsofArray page title step....")
	public String getTitleApplicationsofArray() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		applicationsofArrayElement.click();
		if (titleApplicationsofArrayElement.isDisplayed())
			return titleApplicationsofArrayElement.getText();
		else
			return " ";
	}

	@Step("verifying applicationsofArray actions in ArrayPage")
	public String applicationsofArrayRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");

		applicationsofArrayElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

}
