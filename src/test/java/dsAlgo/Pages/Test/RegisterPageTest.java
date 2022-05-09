package dsAlgo.Pages.Test;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import dsAlgo.Base.TestBase;
import dsAlgo.Entities.UserProfileInfo;
import dsAlgo.Pages.HomePage;
import dsAlgo.Pages.RegisterPage;
import dsAlgo.Pages.SignPage;
import dsAlgo.Utilities.ExcelUtils;

public class RegisterPageTest extends TestBase {

	HomePage HomePage;
	SignPage SignPage;
	RegisterPage RegisterPage;

	public RegisterPageTest() {
		super();
	}

	@DataProvider(name = "DSSheetData")
	public UserProfileInfo[] DSSheet1Data() throws Exception {
		UserProfileInfo[] userInfo = new UserProfileInfo[1];
		UserProfileInfo testObject = ExcelUtils.getUserProfileFromExcel(TestBase.prop.getProperty("excel_File"),
				TestBase.prop.getProperty("excel_SheetName"));
		userInfo[0] = testObject;
		return userInfo;
	}

	@BeforeMethod
	public void setup() {
		initialization();
		RegisterPage = new RegisterPage();
	}

	//@Test
	public void ValidateTextTest() {
		String Title = RegisterPage.ValidateText();
		Assert.assertEquals(Title, "NumpyNinja");
	}

	//@Test(dataProvider = "DSSheetData")
	public void RegisterPageTest(UserProfileInfo userProfile) {
		SignPage = RegisterPage.Register(userProfile.username, userProfile.password, userProfile.password);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
