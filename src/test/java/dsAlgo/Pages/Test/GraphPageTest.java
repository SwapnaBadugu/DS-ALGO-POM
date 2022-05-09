package dsAlgo.Pages.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsAlgo.Base.TestBase;
import dsAlgo.DataProvider.DataProviders;
import dsAlgo.Entities.UserProfileInfo;
import dsAlgo.Pages.GraphPage;
import dsAlgo.Pages.HomePage;
import dsAlgo.Pages.SignPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class GraphPageTest extends TestBase {
	UserProfileInfo[] userprofileinfo;
	HomePage homePage;
	SignPage signPage;
	GraphPage graphPage;

	public GraphPageTest() throws Exception {
		super();

		DataProviders dp = new DataProviders(TestBase.prop);
		userprofileinfo = dp.DSSheet1Data();
	}

	@BeforeMethod()
	public void setup() {
		initialization();
		signPage = new SignPage(driver);
		homePage = signPage.Login(userprofileinfo[0].username, userprofileinfo[0].password);
		graphPage = homePage.Graph();
	}

	@Test(priority = 1, description = "verifying Graph title in GrpahPage test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: To verify Graph title in GrpahPage test")
	@Story("Story Name:To check Graph title in GrpahPage test")
	public void verifyTitleTest() {
		String aTitle = graphPage.getTitleGraph();
		Assert.assertEquals(aTitle, "Graph");
	}

	@Test(priority = 2, description = "verifying graph actions in Graph test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify graph actions in Graph test")
	@Story("Story Name:To check graph actions in Graph test")
	public void graphElementRunTest() {

		String inputText = "10";

		String outputText = graphPage.graphElementRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 3, description = "verifying graphRepresentations actions in Graph test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify graphRepresentations actions in Graph test")
	@Story("Story Name:To check graphRepresentations actions in Grpah test")
	public void graphRepresentationsRunTest() {

		String inputText = "10";

		String outputText = graphPage.graphRepresentationsRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@AfterMethod()

	public void teardown() {
		driver.quit();
	}

}
