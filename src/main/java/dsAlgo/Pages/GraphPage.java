package dsAlgo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo.Base.TestBase;
import io.qameta.allure.Step;

public class GraphPage extends TestBase {

	@FindBy(xpath = "//h4[contains(text(),'Graph')]")
	WebElement titlegraphElement;

	@FindBy(linkText = "Graph")
	WebElement graphElement;

	@FindBy(linkText = "Graph Representations")
	WebElement graphRepresentationsElement;

	@FindBy(linkText = "Try here>>>")
	WebElement tryHereElement;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement writeTextElement;

	@FindBy(css = "button[type='button']")
	WebElement runElement;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement resultElement;

	public GraphPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@Step("getting Grapg page title step....")
	public String getTitleGraph() {
		if (titlegraphElement.isDisplayed())
			return titlegraphElement.getText();
		else
			return " ";
	}

	@Step("verifying graph actions in GraphPage")
	public String graphElementRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		graphElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying graphRepresentations actions in GraphPage")
	public String graphRepresentationsRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		graphRepresentationsElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}
}
