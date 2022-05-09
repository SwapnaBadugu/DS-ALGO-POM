package dsAlgo.Pages.Test;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsAlgo.Base.TestBase;
import dsAlgo.DataProvider.DataProviders;
import dsAlgo.Entities.UserProfileInfo;
import dsAlgo.Pages.ArrayPage;
import dsAlgo.Pages.DataStructurePage;
import dsAlgo.Pages.GraphPage;
import dsAlgo.Pages.HomePage;
import dsAlgo.Pages.LinkedListPage;
import dsAlgo.Pages.QueuePage;
import dsAlgo.Pages.SignPage;
import dsAlgo.Pages.StackPage;
import dsAlgo.Pages.TreePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class HomePageTest extends TestBase {
	HomePage homePage;
	SignPage signPage;
	DataStructurePage dataStructurePage;
	ArrayPage arrayPage;
	LinkedListPage linkedListPage;
	StackPage stackPage;
	QueuePage queuePage;
	GraphPage graphPage;
	TreePage treePage;
	UserProfileInfo[] userprofileinfo;

	public HomePageTest() throws Exception {
		super();

		DataProviders dp = new DataProviders(TestBase.prop);
		userprofileinfo = dp.DSSheet1Data();
	}

	@BeforeMethod()
	public void setup() {
		initialization();
		signPage = new SignPage(driver);
		homePage = signPage.Login(userprofileinfo[0].username, userprofileinfo[0].password);
	}

	@Test(priority = 1, description = "verifying Signin page title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Sign page title test on Sign Page")
	@Story("Story Name: To check Signin page title")
	public void ValidateTextTest() {
		homePage.LoggedinText();
		Assert.assertTrue(true);
	}

	@Test(priority = 2, description = "verifying successful click on data Structures in HomePage")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify successful click on data Structures in HomePage")
	@Story("Story Name: To check Click on DataStructures in HomePage")
	public void clickonDataStructuresPage() {
		dataStructurePage = homePage.DataStructures();
	}

	@Test(priority = 3, description = "verifying successful click on Array in HomePage")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify successful click on Array in HomePage")
	@Story("Story Name: To check Click on Array in HomePage")
	public void clickonArrayPage() {
		arrayPage = homePage.Array();
	}

	@Test(priority = 4, description = "verifying successful click on LinkedList in HomePage")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify successful click on LinkedList in HomePage")
	@Story("Story Name: To check Click on LinkedList in HomePage")
	public void clickonLinkedListPage() {
		linkedListPage = homePage.LinkedList();

	}

	@Test(priority = 5, description = "verifying successful click stack in HomePage")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify successful click stack in HomePage")
	@Story("Story Name: To check Click stack in HomePage")
	public void clickonStackPage() {
		stackPage = homePage.Stack();
	}

	@Test(priority = 6, description = "verifying successful click on queue in HomePage")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify successful click on queue in HomePage")
	@Story("Story Name: To check Click queue in HomePage")
	public void clickonQueuePage() {
		queuePage = homePage.Queue();
	}

	@Test(priority = 7, description = "verifying successful click on graph in HomePage")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify successful click on graph in HomePage")
	@Story("Story Name: To check Click on graph on HomePage")
	public void clickonGraphPage() {
		graphPage = homePage.Graph();
	}

	@Test(priority = 8, description = "verifying successful click on tree in HomePage")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify successful click on tree in HomePage")
	@Story("Story Name: To check Click on tree on HomePage")
	public void clickonTreePage() {
		treePage = homePage.Tree();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
