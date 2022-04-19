package StepDefination;





import org.browser.com.eBay_browser;
import org.openqa.selenium.WebDriver;
import org.pages.com.Help_and_Contact;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Buying_as_guest {
	public WebDriver driver;
	@Given("open the browser")
	public void user_is_on_the_home_page() throws Exception {
		eBay_browser.setDriver();
		
	}

	@When("enter the url")
	public void enter_the(String string) throws Exception {
		eBay_browser.getUrl(string);
		
	}

	@Then("Page is displayed")
	public void page_is_displayed() throws Exception {{
		if (eBay_browser.getTitle().equals("home page | eBay")) {
			System.out.println("Page is displayed");
		} else {
			System.out.println(eBay_browser.getTitle());
		}
	}
	}
	@When("user clicks help and contact tab")
	public static void user_clicks_help_and_contact_tab() {
		Help_and_Contact.user_clicks_help_and_contact_tab();
	}

	@Then("user redirected to help and contact page")
	public void user_redirected_to_help_and_contact_page() throws Exception {{
		if (eBay_browser.getTitle().equals("eBay Customer Service")) {
			System.out.println("user redirected to help and contact page");
		} else {
			System.out.println("user doesn't redirected to help and contact page");
		}
	}
	}
	

	@Then("click on buying as a guest tab")
	public static void click_on_buying_as_a_guest_tab() throws InterruptedException{
	 
		Help_and_Contact.click_on_buying_as_a_guest_tab();
	}

	@Then("user is redirected to buying as a guest page")
	public void user_is_redirected_to_buying_as_a_guest_page() throws Exception {{
		if (eBay_browser.getTitle().equals("buying as a guest | eBay")) {
			System.out.println("user redirected to buying as guest page");
		} else {
			System.out.println("user doesn't redirected to buying as guest page");
		}
	}
	}

	@Then("user able to given the feedback")
	public void user_able_to_given_the_feedback() {
		
		Help_and_Contact.user_able_to_given_the_feedback();
		 {
			 System.out.println("Thumbs up");
        }
		
	}
}
