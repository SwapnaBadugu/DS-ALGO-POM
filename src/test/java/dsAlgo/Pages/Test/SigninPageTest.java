package dsAlgo.Pages.Test;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dsAlgo.Base.TestBase;
import dsAlgo.DataProvider.DataProviders;
import dsAlgo.Entities.UserProfileInfo;
import dsAlgo.Pages.HomePage;
import dsAlgo.Pages.SignPage;
import dsAlgo.Utilities.ExcelUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class SigninPageTest extends TestBase {

	HomePage HomePage;
	SignPage SignPage;

	public SigninPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		SignPage = new SignPage(driver);
	}

	@Test(priority = 1, description = "verifying Signin page title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Sign page title test on Sign Page")
	@Story("Story Name: To check Signin page title")
	public void ValidateTextTest() {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "NumpyNinja");
	}

	@Test(dataProvider = "Credentials", dataProviderClass = DataProviders.class, priority = 2, description = "login into app test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: verify login into application with correct credentials")
	@Story("Story Name: To check login functionality")
	public void SigninPageTest(UserProfileInfo userProfile) {
		HomePage = SignPage.Login(userProfile.username, userProfile.password);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		// driver.close();
	}
}
