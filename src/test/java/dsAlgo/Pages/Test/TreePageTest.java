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
import dsAlgo.Pages.TreePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TreePageTest extends TestBase {
	UserProfileInfo[] userprofileinfo;
	HomePage homePage;
	SignPage signPage;
	TreePage treePage;

	public TreePageTest() throws Exception {
		super();

		DataProviders dp = new DataProviders(TestBase.prop);
		userprofileinfo = dp.DSSheet1Data();
	}

	@BeforeMethod()
	public void setup() {
		initialization();
		signPage = new SignPage(driver);
		homePage = signPage.Login(userprofileinfo[0].username, userprofileinfo[0].password);
		treePage = homePage.Tree();
	}

	@Test(priority = 1, description = "verifying Tree title in TreePage test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: To verify Tree title in TreePage test")
	@Story("Story Name:To check Tree title in TreePage test")
	public void verifyTitleTest() {
		String aTitle = treePage.getTitleTree();
		Assert.assertEquals(aTitle, "Tree");
	}

	@Test(priority = 2, description = "verifying overviewOfTrees actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify overviewOfTrees actions in Tree test")
	@Story("Story Name:To check overviewOfTrees actions in Tree test")
	public void overviewOfTreesRunTest() {

		String inputText = "10";

		String outputText = treePage.overviewOfTreesRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 3, description = "verifying Terminologies actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify Terminologies actions in Tree test")
	@Story("Story Name:To check Terminologies actions in Tree test")
	public void TerminologiesRunTest() {

		String inputText = "10";

		String outputText = treePage.TerminologiesRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 4, description = "verifying TypesofTrees actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify TypesofTrees actions in Tree test")
	@Story("Story Name:To check TypesofTrees actions in Tree test")
	public void TypesofTreestRunTest() {

		String inputText = "10";

		String outputText = treePage.overviewOfTreesRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 5, description = "verifying TreeTraversals actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify TreeTraversals actions in Tree test")
	@Story("Story Name:To check TreeTraversals actions in Tree test")
	public void TreeTraversalsRunTest() {

		String inputText = "10";

		String outputText = treePage.TreeTraversalsRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 6, description = "verifying traversalsIllustration actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify traversalsIllustration actions in Tree test")
	@Story("Story Name:To check traversalsIllustration actions in Tree test")
	public void traversalsIllustrationRunTest() {

		String inputText = "10";

		String outputText = treePage.traversalsIllustrationRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 7, description = "verifying BinaryTreesElement actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify BinaryTreesElement actions in Tree test")
	@Story("Story Name:To check BinaryTreesElement actions in Tree test")
	public void BinaryTreesElementRunTest() {

		String inputText = "10";

		String outputText = treePage.BinaryTreesElementRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 8, description = "verifying TypesofBinaryTrees actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify TypesofBinaryTrees actions in Tree test")
	@Story("Story Name:To check TypesofBinaryTrees actions in Tree test")
	public void TypesofBinaryTreesRunTest() {

		String inputText = "10";

		String outputText = treePage.TypesofBinaryTreesRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 9, description = "verifying ImplementationinPython actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify ImplementationinPython actions in Tree test")
	@Story("Story Name:To check ImplementationinPython actions in Tree test")
	public void ImplementationinPythonRunTest() {

		String inputText = "10";

		String outputText = treePage.ImplementationinPythonRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 10, description = "verifying BinaryTreeTraversals actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify BinaryTreeTraversals actions in Tree test")
	@Story("Story Name:To check BinaryTreeTraversals actions in Tree test")
	public void BinaryTreeTraversalsRunTest() {

		String inputText = "10";

		String outputText = treePage.BinaryTreeTraversalsRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 11, description = "verifying ImplementationofBinaryTrees actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify ImplementationofBinaryTrees actions in Tree test")
	@Story("Story Name:To check ImplementationofBinaryTrees actions in Tree test")
	public void ImplementationofBinaryTreesRunTest() {

		String inputText = "10";

		String outputText = treePage.ImplementationofBinaryTreesRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 12, description = "verifying ApplicationsofBinarytrees actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify ApplicationsofBinarytrees actions in Tree test")
	@Story("Story Name:To check ApplicationsofBinarytrees actions in Tree test")
	public void ApplicationsofBinarytreesRunTest() {

		String inputText = "10";

		String outputText = treePage.ApplicationsofBinarytreesRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 13, description = "verifying BinarySearchTrees actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify BinarySearchTrees actions in Tree test")
	@Story("Story Name:To check BinarySearchTrees actions in Tree test")
	public void BinarySearchTreesRunTest() {

		String inputText = "10";

		String outputText = treePage.BinarySearchTreesRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@Test(priority = 14, description = "verifying ImplementationOfBST actions in Tree test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify ImplementationOfBST actions in Tree test")
	@Story("Story Name:To check ImplementationOfBST actions in Tree test")
	public void ImplementationOfBSTRunTest() {

		String inputText = "10";

		String outputText = treePage.ImplementationOfBSTRun(inputText);
		Assert.assertEquals(outputText, inputText);
	}

	@AfterMethod()

	public void teardown() {
		driver.quit();
	}
}
