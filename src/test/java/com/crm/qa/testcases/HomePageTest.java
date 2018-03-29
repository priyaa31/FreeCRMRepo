package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(enabled=false)
	public void verifyHomePageTitle()
	{
		String actualTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(actualTitle,"CRMPRO","HomePage title not matched");
	}
	
	@Test(enabled=false)
	public void verifyUserName()
	{
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyUserName());
	}
	
	@Test
	public void ContactsLinkTest()
	{
		testUtil.switchToFrame();
		contactsPage = homePage.clickOnContactsLink();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
