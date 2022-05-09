package dsAlgo.Pages.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsAlgo.Base.TestBase;
import dsAlgo.DataProvider.DataProviders;
import dsAlgo.Entities.UserProfileInfo;
import dsAlgo.Pages.ArrayPage;
import dsAlgo.Pages.HomePage;
import dsAlgo.Pages.SignPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class ArrayPageTest extends TestBase {

	UserProfileInfo[] userprofileinfo;
	HomePage homePage;
	SignPage signPage;
	ArrayPage arrayPage;

	public ArrayPageTest() throws Exception {
		super();

		DataProviders dp = new DataProviders(TestBase.prop);
		userprofileinfo = dp.DSSheet1Data();
	}

	@BeforeMethod()
	public void setup() {
		initialization();
		signPage = new SignPage(driver);
		homePage = signPage.Login(userprofileinfo[0].username, userprofileinfo[0].password);
		arrayPage = homePage.Array();
	}

	@Test(priority = 1, description = "verifying Array page title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Array page title test on Array Page")
	@Story("Story Name: To check Array page title")
	public void verifyTitleTest() {
		String aTitle = arrayPage.getTitleArray();
		Assert.assertEquals(aTitle, "Array");
	}

	@Test(priority = 2, description = "verifying Arrayinpython title in Array page test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: verifying Arrayinpython title in Array page test")
	@Story("Story Name: verifying Arrayinpython title in Array page test")
	public void getTitleArrayinpythonTest() {
		String aulTitle = arrayPage.getTitleArrayinpython();

		Assert.assertEquals(aulTitle, "Arrays in Python");
	}

	@Test(priority = 3, description = "verifying ArraysinPython actions test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: verifying ArraysinPython actions test")
	@Story("Story Name: verifying ArraysinPython actions test")
	public void ArraysinPythonRunTest() {

		String inputText = "10";

		String outputText = arrayPage.ArraysinPythonRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 4, description = "verifying ArrayusingList title in Array page test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: verifying ArrayusingList title in Array page test")
	@Story("Story Name: verifying ArrayusingList title in Array page test")
	public void getTitleArrayusingListTest() {
		String aulTitle = arrayPage.getTitleArrayusingList();

		Assert.assertEquals(aulTitle, "Arrays Using List");
	}

	@Test(priority = 5, description = "verifying ArraysusingList actions test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: verifying ArraysusingList actions test")
	@Story("Story Name: verifying ArraysusingList actions test")
	public void ArraysusingListRunTest() {

		String inputText = "10";

		String outputText = arrayPage.ArrayusingListRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 6, description = "verifying BasicOpertaionsinList title in Array page test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: verifying BasicOpertaionsinList title in Array page test")
	@Story("Story Name:verifying BasicOpertaionsinList title in Array page test")
	public void getTitleBasicOperationsinListTest() {
		String bolTitle = arrayPage.getTitleBasicOpertaionsinList();

		Assert.assertEquals(bolTitle, "Basic Operations in Lists");
	}

	@Test(priority = 7, description = "verifying BasicOperationsinList action test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: verifying BasicOperationsinList action test")
	@Story("Story Name: To verify BasicOperationsinList action test")
	public void BasicOperationsinListRunTest() {

		String inputText = "10";

		String outputText = arrayPage.BasicOpertaionsinListRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 8, description = "To check ApplicationsofArray  title in Array page test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description:To check ApplicationsofArray  title in Array page test")
	@Story("Story Name: To check  ApplicationsofArray  title in Array page test")
	public void getTitleApplicationsofArrayTest() {
		String aatTitle = arrayPage.getTitleApplicationsofArray();

		Assert.assertEquals(aatTitle, "Applications of Array");
	}

	@Test(priority = 9, description = "verifying ApplicationsofArray actions test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: verifying ApplicationsofArray actions test")
	@Story("Story Name: To check ApplicationsofArray actions")
	public void ApplicationsofArrayRunTest() {

		String inputText = "10";

		String outputText = arrayPage.applicationsofArrayRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@AfterMethod()

	public void teardown() {
		driver.quit();
	}
}
