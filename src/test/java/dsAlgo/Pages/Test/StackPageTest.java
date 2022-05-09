package dsAlgo.Pages.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsAlgo.Base.TestBase;
import dsAlgo.DataProvider.DataProviders;
import dsAlgo.Entities.UserProfileInfo;
import dsAlgo.Pages.HomePage;
import dsAlgo.Pages.SignPage;
import dsAlgo.Pages.StackPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class StackPageTest extends TestBase {
	UserProfileInfo[] userprofileinfo;
	HomePage homePage;
	SignPage signPage;
	StackPage stackPage;

	public StackPageTest() throws Exception {
		super();

		DataProviders dp = new DataProviders(TestBase.prop);
		userprofileinfo = dp.DSSheet1Data();
	}

	@BeforeMethod()
	public void setup() {
		initialization();
		signPage = new SignPage(driver);
		homePage = signPage.Login(userprofileinfo[0].username, userprofileinfo[0].password);
		stackPage = homePage.Stack();
	}

	@Test(priority = 1, description = "verifying Stack title in StackPage test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: To verify Stack title in StackPage test")
	@Story("Story Name:To check Stack title in StackPage test")
	public void verifyTitleTest() {
		String aTitle = stackPage.getTitleStack();
		Assert.assertEquals(aTitle, "Stack");
	}

	@Test(priority = 2, description = "verifying operationsinStack actions in Stack test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify operationsinStack actions in Stack test")
	@Story("Story Name:To check operationsinStack actions in Stack test")
	public void operationsinStackRunTest() {

		String inputText = "10";

		String outputText = stackPage.operationsinStackRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 3, description = "verifying implementation actions in Stack test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify implementation actions in Stack test")
	@Story("Story Name:To check implementation actions in Stack test")
	public void implementationRunTest() {

		String inputText = "10";

		String outputText = stackPage.implementationRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 4, description = "verifying applications actions in Stack test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify applications actions in Stack test")
	@Story("Story Name:To check applications actions in Stack test")
	public void applicationsRunTest() {

		String inputText = "10";

		String outputText = stackPage.applicationsRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@AfterMethod()

	public void teardown() {
		driver.quit();
	}

}
