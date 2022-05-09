package dsAlgo.Pages.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsAlgo.Base.TestBase;
import dsAlgo.DataProvider.DataProviders;
import dsAlgo.Entities.UserProfileInfo;
import dsAlgo.Pages.DataStructurePage;
import dsAlgo.Pages.HomePage;
import dsAlgo.Pages.SignPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class DataStructurePageTest extends TestBase {

	UserProfileInfo[] userprofileinfo;
	HomePage homePage;
	SignPage signPage;
	DataStructurePage dataStructurePage;

	public DataStructurePageTest() throws Exception {
		super();

		DataProviders dp = new DataProviders(TestBase.prop);
		userprofileinfo = dp.DSSheet1Data();
	}

	@BeforeMethod()
	public void setup() {
		initialization();
		signPage = new SignPage(driver);
		homePage = signPage.Login(userprofileinfo[0].username, userprofileinfo[0].password);
		dataStructurePage = homePage.DataStructures();
	}

	@Test(priority = 1, description = "verifying DataStructure page title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify DataStructure page title test on DataStructure Page")
	@Story("Story Name: To check DataStructure page title")
	public void verifyTitleTest() {
		String dsTitle = dataStructurePage.getTitle();
		Assert.assertEquals(dsTitle, "Data Structures-Introduction");
	}

	@Test(priority = 2, description = "verifying DataStructure page actions test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify DataStructure page tests")
	@Story("Story Name: To check DataStructure page actionstests")
	public void dataStructureTest() {
		String inputText = "10";
		String outputText = dataStructurePage.dataStructuresRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@AfterMethod()
	public void teardown() {
		driver.quit();
	}

}
