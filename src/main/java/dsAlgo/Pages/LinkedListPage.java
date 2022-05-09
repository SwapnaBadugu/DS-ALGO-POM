package dsAlgo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo.Base.TestBase;
import io.qameta.allure.Step;

public class LinkedListPage extends TestBase {

	@FindBy(xpath = "//h4[contains(text(),'Linked List')]")
	WebElement llTitleElement;

	@FindBy(linkText = "Introduction")
	WebElement introductionElement;

	@FindBy(linkText = "Creating Linked LIst")
	WebElement creatingLinkedLIstElement;

	@FindBy(linkText = "Types of Linked List")
	WebElement typesofLinkedListElement;

	@FindBy(linkText = "Implement Linked List in Python")
	WebElement implementLinkedListpythonElement;

	@FindBy(linkText = "Traversal")
	WebElement traversalElement;

	@FindBy(linkText = "Insertion")
	WebElement insertionElement;

	@FindBy(linkText = "Deletion")
	WebElement deletionElement;

	@FindBy(linkText = "Try here>>>")
	WebElement tryHereElement;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement writeTextElement;

	@FindBy(css = "button[type='button']")
	WebElement runElement;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement resultElement;

	public LinkedListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@Step("getting LinkedList page title step....")
	public String getTitleLinkedlist() {
		if (llTitleElement.isDisplayed())
			return llTitleElement.getText();
		else
			return " ";
	}

	@Step("To check Introduction actions in LinkedListPage")
	public String IntroductionRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		introductionElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("To check creatingLinkedLIst actions in LinkedListPage")
	public String creatingLinkedLIstRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		creatingLinkedLIstElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("To check typesofLinkedList actions in LinkedListPage")

	public String typesofLinkedListRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		typesofLinkedListElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("To check implementLinkedListpython actions in LinkedListPage")

	public String implementLinkedListpythonRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		implementLinkedListpythonElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("To check traversal actions in LinkedListPage")

	public String traversalRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		traversalElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("To check Insertion actions in LinkedListPage")

	public String InsertionElementRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		insertionElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("To check deletion actions in LinkedListPage")

	public String deletionRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		deletionElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

}
