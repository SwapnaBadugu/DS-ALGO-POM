package dsAlgo.Pages.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsAlgo.Base.TestBase;
import dsAlgo.DataProvider.DataProviders;
import dsAlgo.Entities.UserProfileInfo;
import dsAlgo.Pages.HomePage;
import dsAlgo.Pages.QueuePage;
import dsAlgo.Pages.SignPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class QueuePageTest extends TestBase {
	UserProfileInfo[] userprofileinfo;
	HomePage homePage;
	SignPage signPage;
	QueuePage queuePage;

	public QueuePageTest() throws Exception {
		super();

		DataProviders dp = new DataProviders(TestBase.prop);
		userprofileinfo = dp.DSSheet1Data();
	}

	@BeforeMethod()
	public void setup() {
		initialization();
		signPage = new SignPage(driver);
		homePage = signPage.Login(userprofileinfo[0].username, userprofileinfo[0].password);
		queuePage = homePage.Queue();
	}

	@Test(priority = 1, description = "verifying Queue title in QueuePage test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: To verify Queue title in QueuePage test")
	@Story("Story Name:To check Queue title in QueuePage test")
	public void verifyTitleTest() {
		String aTitle = queuePage.getTitleQueue();
		Assert.assertEquals(aTitle, "Queue");
	}

	@Test(priority = 2, description = "verifying ImplementationofQueueinPython actions in Queue test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify ImplementationofQueueinPython actions in Queue test")
	@Story("Story Name:To check ImplementationofQueueinPython actions in Queue test")
	public void ImplementationofQueueinPythonRunTest() {

		String inputText = "10";

		String outputText = queuePage.ImplementationofQueueinPythonRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 3, description = "verifying Implementationusingcollections actions in Queue test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify Implementationusingcollections actions in Queue test")
	@Story("Story Name:To check Implementationusingcollections actions in Queue test")
	public void ImplementationusingcollectionsRunTest() {

		String inputText = "10";

		String outputText = queuePage.ImplementationusingcollectionsRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 4, description = "verifying Implementationusingarray actions in Queue test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify Implementationusingarray actions in Queue test")
	@Story("Story Name:To check Implementationusingarray actions in Queue test")
	public void ImplementationusingarrayRunTest() {

		String inputText = "10";

		String outputText = queuePage.ImplementationusingarrayRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 5, description = "verifying queueOperations actions in Queue test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify queueOperations actions in Queue test")
	@Story("Story Name:To check queueOperations actions in Queue test")
	public void queueOperationsRunTest() {

		String inputText = "10";

		String outputText = queuePage.ImplementationofQueueinPythonRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@AfterMethod()

	public void teardown() {
		driver.quit();
	}
}
