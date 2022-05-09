package dsAlgo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo.Base.BasePage;
import io.qameta.allure.Step;

public class TreePage extends BasePage {

	@FindBy(xpath = "//h4[contains(text(),'Tree')]")
	WebElement titleTreeElement;

	@FindBy(linkText = "Overview of Trees")
	WebElement overviewOfTreesElement;

	@FindBy(linkText = "Terminologies")
	WebElement TerminologiesElement;

	@FindBy(linkText = "Types of Trees")
	WebElement typesOfTreeElement;

	@FindBy(linkText = "Tree Traversals")
	WebElement TreeTraversalsElement;

	@FindBy(linkText = "Traversals-Illustration")
	WebElement traversalsIllustrationElement;

	@FindBy(linkText = "Binary Trees")
	WebElement BinaryTreesElement;

	@FindBy(linkText = "Types of Binary Trees")
	WebElement TypesofBinaryTreesElement;

	@FindBy(linkText = "Implementation in Python")
	WebElement ImplementationinPythonElement;

	@FindBy(linkText = "Binary Tree Traversals")
	WebElement BinaryTreeTraversalsElement;

	@FindBy(linkText = "Implementation of Binary Trees")
	WebElement ImplementationofBinaryTreesElement;

	@FindBy(linkText = "Applications of Binary trees")
	WebElement ApplicationsofBinarytreesElement;

	@FindBy(linkText = "Binary Search Trees")
	WebElement BinarySearchTreesElement;

	@FindBy(linkText = "Implementation Of BST")
	WebElement ImplementationOfBSTElement;

	@FindBy(linkText = "Try here>>>")
	WebElement tryHereElement;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement writeTextElement;

	@FindBy(css = "button[type='button']")
	WebElement runElement;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement resultElement;

	public TreePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@Step("getting Tree page title step....")
	public String getTitleTree() {
		if (titleTreeElement.isDisplayed())
			return titleTreeElement.getText();
		else
			return " ";
	}

	@Step("verifying overviewOfTrees actions in TreePage")
	public String overviewOfTreesRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		overviewOfTreesElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying Terminologies actions in TreePage")
	public String TerminologiesRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		TerminologiesElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying TypesofTrees actions in TreePage")

	public String TypesofTreestRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		typesOfTreeElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying TreeTraversals actions in TreePage")

	public String TreeTraversalsRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		TreeTraversalsElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying traversalsIllustration actions in TreePage")
	public String traversalsIllustrationRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		traversalsIllustrationElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying BinaryTreesElement actions in TreePage")

	public String BinaryTreesElementRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		BinaryTreesElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying TypesofBinaryTrees actions in TreePage")
	public String TypesofBinaryTreesRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		TypesofBinaryTreesElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying ImplementationinPython actions in TreePage")
	public String ImplementationinPythonRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		ImplementationinPythonElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying BinaryTreeTraversals actions in TreePage")
	public String BinaryTreeTraversalsRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		BinaryTreeTraversalsElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying ImplementationofBinaryTrees actions in TreePage")
	public String ImplementationofBinaryTreesRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		ImplementationofBinaryTreesElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying ApplicationsofBinarytrees actions in TreePage")
	public String ApplicationsofBinarytreesRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		ApplicationsofBinarytreesElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying BinarySearchTrees actions in TreePage")
	public String BinarySearchTreesRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		BinarySearchTreesElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

	@Step("verifying ImplementationOfBST actions in TreePage")
	public String ImplementationOfBSTRun(String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		ImplementationOfBSTElement.click();

		js.executeScript("scroll(0,2800)");

		tryHereElement.click();
		writeTextElement.sendKeys("print " + text);
		runElement.click();

		return resultElement.getText();
	}

}
