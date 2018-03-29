package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase
{
	
	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	// Initializing the Page Objects:
		public ContactsPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		public boolean verifyContactsLabel(){
			return contactsLabel.isDisplayed();
		}
		
		
		public void selectContactsByName(){
			//driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
			//		+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'A5 A6')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		}
}
