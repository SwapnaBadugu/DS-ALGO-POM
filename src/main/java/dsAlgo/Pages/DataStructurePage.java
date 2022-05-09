package dsAlgo.Pages;

import org.asynchttpclient.config.AsyncHttpClientConfigHelper.Config;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class DataStructurePage {

	WebDriver driver;

	// @FindBy(xpath = "h4[class='bg-secondary text-white']")
	@FindBy(xpath = "//h4[contains(text(),'Data Structures-Introduction')]")
	WebElement titleDataStructures;

	@FindBy(linkText = "Time Complexity")
	WebElement timeComplexity;

	@FindBy(linkText = "Try here>>>")
	WebElement tryHere;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement writeText;

	@FindBy(css = "button[type='button']")
	WebElement run;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement result;

	public DataStructurePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@Step("getting Datastructure page title step....")
	public String getTitle() {

		if (titleDataStructures.isDisplayed())
			return titleDataStructures.getText();
		else
			return " ";
	}

	// MethodDefinition,MethodSignature,AccessModifier
	// MethodReturnType,MethodName,parameter(s) (variableDataType, variableName)
	@Step("verifying DataStructure page action steps")
	public String dataStructuresRun(String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");

		timeComplexity.click();
		js.executeScript("scroll(0,2800)");

		tryHere.click();
		writeText.sendKeys("print " + text);
		run.click();
		return result.getText();
	}
}
