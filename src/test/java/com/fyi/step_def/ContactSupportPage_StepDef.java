package com.fyi.step_def;

import com.fyi.pages.ContactSupportPage;
import com.fyi.pages.HamburgerMenuPage;
import com.fyi.utilities.BrowserUtilities;
import com.fyi.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactSupportPage_StepDef {
    HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
    ContactSupportPage contactSupportPage = new ContactSupportPage();
    String actualHeader;


    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String option) {
        hamburgerMenuPage.clickTheOption(option);

    }
    @Then("the Help page should be displayed")
    public void the_help_page_should_be_displayed() {

        BrowserUtilities.switchWindowAndVerify("https://help.fyi.me/hc/en-us","help");


    }
    @When("the user clicks on the Contact Support button")
    public void the_user_clicks_on_the_contact_support_button() {
        contactSupportPage.contactSupport.click();

    }
    @Then("the user should be redirected to the Submit Request page")
    public void the_user_should_be_redirected_to_the_submit_request_page() {
        actualHeader = contactSupportPage.submitRequestHeader.getText();

    }
    @Then("the Submit Request form should be displayed")
    public void the_submit_request_form_should_be_displayed() {
        Assert.assertEquals("Submit a request",actualHeader);

    }
}
