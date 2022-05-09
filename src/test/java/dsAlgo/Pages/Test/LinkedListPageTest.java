package dsAlgo.Pages.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsAlgo.Base.TestBase;
import dsAlgo.DataProvider.DataProviders;
import dsAlgo.Entities.UserProfileInfo;
import dsAlgo.Pages.HomePage;
import dsAlgo.Pages.LinkedListPage;
import dsAlgo.Pages.SignPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LinkedListPageTest extends TestBase {
	UserProfileInfo[] userprofileinfo;
	HomePage homePage;
	SignPage signPage;
	LinkedListPage linkedListPage;

	public LinkedListPageTest() throws Exception {
		super();

		DataProviders dp = new DataProviders(TestBase.prop);
		userprofileinfo = dp.DSSheet1Data();
	}

	@BeforeMethod()
	public void setup() {
		initialization();
		signPage = new SignPage(driver);
		homePage = signPage.Login(userprofileinfo[0].username, userprofileinfo[0].password);
		linkedListPage = homePage.LinkedList();
	}

	@Test(priority = 1, description = "verifying Linked List title in Linked ListPage test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: To verify Linked List title in Linked ListPage test")
	@Story("Story Name:To check Linked List title in Linked ListPage test")
	public void verifyTitleTest() {
		String aTitle = linkedListPage.getTitleLinkedlist();
		Assert.assertEquals(aTitle, "Linked List");
	}

	@Test(priority = 2, description = "verifying Introduction actions in LinkedListPage test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify Introduction actions in Linked ListPage test")
	@Story("Story Name:To check Introduction actions in Linked ListPage test")
	public void IntroductionRunTest() {

		String inputText = "10";

		String outputText = linkedListPage.IntroductionRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 3, description = "verifying creatingLinkedLIst actions in LinkedListPage test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: To verify creatingLinkedLIst actions in Linked ListPage test")
	@Story("Story Name:To check creatingLinkedLIst actions in Linked ListPage test")
	public void creatingLinkedLIstRunTest() {

		String inputText = "10";

		String outputText = linkedListPage.creatingLinkedLIstRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 4, description = "verifying typesofLinkedList actions in LinkedListPage test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify typesofLinkedList actions in Linked ListPage test")
	@Story("Story Name:To check typesofLinkedList actions in Linked ListPage test")
	public void typesofLinkedListRunTest() {

		String inputText = "10";

		String outputText = linkedListPage.typesofLinkedListRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 5, description = "verifying implementLinkedListpython actions in LinkedListPage test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: To verify implementLinkedListpython actions in Linked ListPage test")
	@Story("Story Name:To check implementLinkedListpython actions in Linked ListPage test")
	public void implementLinkedListpythonRunTest() {

		String inputText = "10";

		String outputText = linkedListPage.implementLinkedListpythonRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 6, description = "verifying traversal actions in LinkedListPage test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify traversal actions in Linked ListPage test")
	@Story("Story Name:To check traversal actions in Linked ListPage test")
	public void traversalRunTest() {

		String inputText = "10";

		String outputText = linkedListPage.traversalRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 6, description = "verifying InsertionElement actions in LinkedListPage test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify InsertionElement actions in Linked ListPage test")
	@Story("Story Name:To check InsertionElement actions in Linked ListPage test")
	public void InsertionElementRunTest() {

		String inputText = "10";

		String outputText = linkedListPage.InsertionElementRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 7, description = "verifying deletion actions in LinkedListPage test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify deletion actions in Linked ListPage test")
	@Story("Story Name:To check deletion actions in Linked ListPage test")
	public void deletionRunTest() {

		String inputText = "10";

		String outputText = linkedListPage.deletionRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@AfterMethod()

	public void teardown() {
		driver.quit();
	}
}
