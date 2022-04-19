package org.pages.com;

import org.browser.com.eBay_browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Help_and_Contact extends eBay_browser {
	static By helpandcontact = By.xpath("//ul[@id=\"gh-topl\"]/li[3]/a");
	
//	WebDriver driver;
//	static by(xpath="//ul[@id=\"gh-topl\"]/li[3]/a")
public static WebElement user_clicks_help_and_contact_tab;
//	

static By helpandcontact2 = By.xpath("//h2[@class=\"main_title\"]");
public static WebElement click_on_buying_as_a_guest_tab;
//	@FindBy(xpath="//h2[@class=\"main_title\"]")
//	public static WebElement click_on_buying_as_a_guest_tab;
//
//	@FindBy(xpath="//div[@class=\\\"voteButton\\\"]/div[2]")
//	public static WebElement user_able_to_given_the_feedback;

static By helpandcontact3 = By.xpath("//div[@class=\"voteButton\"]/div[2]");
public static WebElement user_able_to_given_the_feedback;
//	public Help_and_Contact(WebDriver driver) {
//		this.driver = driver;
//		// Call initElements() method by using PageFactory reference and pass driver and this as parameters. 
//	    PageFactory.initElements( driver, this); 
//	}

	
		public static void click_on_buying_as_a_guest_tab() {
			// TODO Auto-generated method stub
			try
			{
				WebElement helpandcontact1 = driver.findElement(helpandcontact2);
				helpandcontact1.click();
			}
			catch(Exception e)
			{
				System.out.println("click on buying as a guest tab");
				System.out.println(e);
			}
		}
		private static Object xpath(String string) {
			// TODO Auto-generated method stub
			return null;
		}
		public static void user_able_to_given_the_feedback() {
			// TODO Auto-generated method stub
			try
			{
				WebElement helpandcontact4 = driver.findElement(helpandcontact3);
				helpandcontact4.click();
			}
			catch(Exception e)
			{
				System.out.println("user able to given the feedback");
				System.out.println(e);
			}
		}

		public static void user_clicks_help_and_contact_tab() {
			// TODO Auto-generated method stub
			try
			{
				WebElement helpandcontact5 = driver.findElement(helpandcontact);
				helpandcontact5.click();
			}
			catch(Exception e)
			{
				System.out.println("user clicks help and contact tab");
				System.out.println(e);
			}
		}

		
		
		
	
}
