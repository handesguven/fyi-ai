package com.fyi.step_def;

import com.fyi.pages.ContactSupportPage;
import com.fyi.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchInput_StepDef {
    ContactSupportPage contactSupportPage =new ContactSupportPage();


    @When("the user locates the search field on the Submit Request page")
    public void the_user_locates_the_search_field_on_the_submit_request_page() {
        Assert.assertTrue(contactSupportPage.searchInput.isDisplayed());
    }
    @When("the user enters {string} in the search field and presses the Enter key")
    public void the_user_enters_in_the_search_field_and_presses_the_enter_key(String keyWord) {

        contactSupportPage.searchInput.sendKeys(keyWord, Keys.ENTER);
    }
    @Then("the search results should return exactly {string} articles")
    public void the_search_results_should_return_exactly_articles(String expectedResult) {

       String actualResultHeader = contactSupportPage.searchResultHeader.getText();

        Assert.assertTrue(actualResultHeader.contains(expectedResult));

        }


}
