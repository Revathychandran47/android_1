package Services_positive_scenario;

import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Services_positive_scenario extends Generic_functions{
public static boolean str,str1;
	
	/* Application is launching , user is logging in to the home page and navigating to the services page by clicking Services tab on home page */
	@Given("User is on home page and clicks on Services tab")
	public void app_launching() throws Exception {
		try {
			app_launch();
			page_wait(20);
			click("welcome_login");
			page_wait(30);
			click("login_phone_number");
			driver.findElement(By.xpath(OR_reader("Object Locator","login_phone_number"))).sendKeys(td_reader("login_phone_number",1));
			driver.findElement(By.xpath(OR_reader("Object Locator","login_password"))).sendKeys(td_reader("login_password",1));
			page_wait(20);
			click("login");
			page_wait(30);
			click("services");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
	/* TC_001 - Validate that the user is navigated to the Services page on clicking Services tab*/
	@Then("User should be navigated to services page")
	public void services_positive_tc_001() throws Exception {
		try {
			str=driver.findElement(By.xpath(OR_reader("Object Locator","services_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_001");
		}
	}
	
	/* User is navigating to the services page by clicking Services tab*/
	@Given("User is on Services page")
	public void user_is_on_services_page() throws Exception {
	    try {
			click("services");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* TC_002- Validate that the user is navigated to the Second Opinion page on clicking Second Opinions*/
	@Then("User should be navigated to Second opinions page on clicking Second opinions tab")
	public void services_positive_tc_002() throws Exception {
		try {
			click("second_opinions");
			str=driver.findElement(By.xpath(OR_reader("Object Locator","second_opinions_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_002");
		}
	}
	
	/* TC_003 - Validate that the user is navigated to the Conditions page on clicking Conditions*/
	@Then("User should be navigated to Conditions page on clicking conditions tab")
	public void services_positive_tc_003() throws Exception {
		try {
			click("conditions");
			str=driver.findElement(By.xpath(OR_reader("Object Locator","conditions_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_003");
		}
	}
	
	/* TC_004 - Validate that the user is navigated to the Medications page on clicking Medications*/
	@Then("User should be navigated to Medications page on clicking Medications tab")
	public void services_positive_tc_004() throws Exception {
		try {
			click("medications");
			str=driver.findElement(By.xpath(OR_reader("Object Locator","medications_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_004");
		}
	}
	
	/* TC_011 - Validate that the user is navigated to the Bills page on clicking Bills */
	@Then("User should be navigated to Bills page on clicking Bills tab")
	public void services_positive_tc_011() throws Exception {
		try {
			click("bills");
			str=driver.findElement(By.xpath(OR_reader("Object Locator","bills_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_011");
		}
	}

	/* TC_012- Validate that the user is navigated to the Claims page on clicking Claims */
	@Then("User should be navigated to Claims page on clicking Claims tab")
	public void services_positive_tc_012() throws Exception{
		try {
			click("claims");
			page_wait(20);
			str=driver.findElement(By.xpath(OR_reader("Object Locator","claims_title"))).isDisplayed();
			Assert.assertEquals(str, true);
			click("services");
			click("hamburger");
			click("logout");
			System.out.println("Services positive");
			close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_012");
		}
	}
}
