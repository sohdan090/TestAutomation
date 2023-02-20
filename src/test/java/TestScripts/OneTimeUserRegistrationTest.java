package TestScripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static core.ExtentTestManager.reporterLog;

import java.io.IOException;
import java.util.HashMap;

import core.DriverManager;
import core.Utility;
import pages.admin.AdminHomePage;
import pages.admin.AdminPortalLoginPage;
import pages.user.ProcessTransactionPage;
import pages.user.UserHomePage;
import pages.user.UserPortalLoginPage;
import pages.user.UserRegistrationPage;

public class OneTimeUserRegistrationTest extends DriverManager {
	HashMap<String, String> companyDetailsMap;
	String password;

	@BeforeClass
	public void initializeObjects() {
		userPortalLoginPage = new UserPortalLoginPage(getWebDriver());
		adminPortalLoginPage = new AdminPortalLoginPage(getWebDriver());
	}

	@Test(enabled = true)
	public void tc01_oneTimeImporter_UserRegistration() throws InterruptedException, IOException {
		Utility.openBrowser(getWebDriver(), "UserPortalURL");
		
	}

	@AfterClass
	public void tearsDown() {
		reporterLog("Close browser");
		getWebDriver().quit();
	}
}