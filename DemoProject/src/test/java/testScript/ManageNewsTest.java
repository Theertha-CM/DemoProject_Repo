package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	
	HomePage homepage;
	ManageNewsPage newspage;

	@Test(description="Test Case")
	public void verifyTheAdminIsAbleToAddNews() throws IOException
	{
		String usernameValue = ExcelUtility.getStringData(1, 0, "loginpage"); //Fetching username from the excel file from the sheet loginpage
		String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");
		
		LoginPage loginpage = new LoginPage(driver); //Creating an object of LoginPAge Class to call the methods here.
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
//		loginpage.enterPassword(passwordValue);
		homepage=loginpage.clickonSignInButton();
		
		String newsValue = ExcelUtility.getStringData(0, 0, "newspage");
		
//		ManageNewsPage newspage = new ManageNewsPage(driver);
		newspage=homepage.clickOnManageNewsMoreInfoButton();
		newspage.clickOnNewButton().enterTheNews(newsValue).clickOnSaveButton();
//		newspage.enterTheNews(newsValue);
//		newspage.clickOnSaveButton();
		boolean alertmsg = newspage.isAlertMsgDisplayed();
		Assert.assertTrue(alertmsg);
		
		
		
		
	}
	
}
