package dsAlgo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo.Base.BasePage;
import io.qameta.allure.Step;

public class HomePage {

	WebDriver webdriver;

	@FindBy(xpath = "//div[contains(text(),'You are logged in')]")
	WebElement loggedinTextElement;

	@FindBy(css = "a[href='data-structures-introduction']")
	WebElement dataStructuresElement;

	@FindBy(css = "a[href= 'array']")
	WebElement arrayElement;

	@FindBy(css = "a[href= 'linked-list']")
	WebElement linkedListElement;

	@FindBy(css = "a[href='stack']")
	WebElement stackElement;

	@FindBy(css = "a[href='queue']")
	WebElement queueElement;

	@FindBy(css = "a[href='tree']")
	WebElement treeElement;

	@FindBy(css = "a[href='graph']")
	WebElement graphElement;

	public HomePage(WebDriver driver) {
		webdriver = driver;
		PageFactory.initElements(driver, this);
	}

	@Step("getting Signin page title step....")
	public boolean LoggedinText() {
		return loggedinTextElement.isDisplayed();
	}

	@Step("clicking on DataStructures in HomePage step")
	public DataStructurePage DataStructures() {
		dataStructuresElement.click();
		return new DataStructurePage(webdriver);
	}

	@Step("clicking on Array in HomePage step")
	public ArrayPage Array() {
		arrayElement.click();
		return new ArrayPage(webdriver);
	}

	@Step("clicking on LinkedList in HomePage step")
	public LinkedListPage LinkedList() {
		linkedListElement.click();
		return new LinkedListPage(webdriver);
	}

	@Step("clicking on Stack in HomePage step")
	public StackPage Stack() {
		stackElement.click();
		return new StackPage(webdriver);
	}

	@Step("clicking on Queue in HomePage step")
	public QueuePage Queue() {
		queueElement.click();
		return new QueuePage(webdriver);
	}

	@Step("clicking on Graph in HomePage step")
	public GraphPage Graph() {
		graphElement.click();
		return new GraphPage(webdriver);
	}

	@Step("clicking on Tree in HomePage step")
	public TreePage Tree() {
		treeElement.click();
		return new TreePage(webdriver);
	}

}
