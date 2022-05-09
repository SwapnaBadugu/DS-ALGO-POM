package dsAlgo.DataProvider;

import java.util.Properties;

import org.testng.annotations.DataProvider;

import dsAlgo.Base.TestBase;
import dsAlgo.Entities.UserProfileInfo;
import dsAlgo.Utilities.ExcelUtils;

public class DataProviders {

	Properties _prop;
	ExcelUtils obj = new ExcelUtils();

	public DataProviders() {

	}

	public DataProviders(Properties prop) {
		this._prop = prop;
	}

	@DataProvider(name = "Credentials")
	public UserProfileInfo[] DSSheet1Data() throws Exception {
		UserProfileInfo[] userInfo = new UserProfileInfo[1];
		if (this._prop == null)
			this._prop = TestBase.prop;

		UserProfileInfo testObject = ExcelUtils.getUserProfileFromExcel(this._prop.getProperty("excel_File"),
				this._prop.getProperty("excel_SheetName"));
		userInfo[0] = testObject;
		return userInfo;
	}

}
