package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageobjects.BaseClass;
import pageobjects.SubmitRequestPage;
import pageobjects.SupportPage;
import utilities.BrowserProvider;
import utilities.DataUtils;

public class Steps extends BaseClass {

  @Given("User launch chrome browser")
  public void user_launch_chrome_browser() {
    driver = BrowserProvider.getChromeWebDriver();
    supportPage = new SupportPage(driver);
    submitRequestPage = new SubmitRequestPage(driver);
  }

  @When("User opens wire support page URL {string}")
  public void user_opens_wire_support_page_url(String url) {
    driver.get(url);
  }

  @Then("Support page title should be present")
  public void support_page_title_should_be_present() {
    assertEquals(DataUtils.EXPECTED_PAGE_TITLE, supportPage.getSupportPageTitleText());
  }

  @When("Search a question with keyword {string}")
  public void search_a_question_with_keyword(String keyWord) {
    supportPage.searchQuestion(keyWord);
  }

  @Then("Search results should be displayed")
  public void search_results_should_be_displayed() {
    assertEquals(DataUtils.EXPECTED_SECURITY_SEARCH_RESULT, supportPage.getSearchResult());
  }

  @And("Click on result link")
  public void click_on_result_link() {
    supportPage.clickOnResultLink();
  }

  @Then("Article should be displayed")
  public void article_should_be_displayed() {
    assertEquals(DataUtils.EXPECTED_ARTICLE_HEADLINE, supportPage.articleShouldBeDisplayed());
  }

  @When("Search another question with keyword {string}")
  public void search_another_question_with_keyword(String keyWord) {
    supportPage.searchAnotherQuestion(keyWord);
  }

  @Then("No Results found should be displayed")
  public void no_results_found_should_be_displayed() {
    assertEquals(DataUtils.EXPECTED_PAYMENT_SEARCH_RESULT, supportPage.getPaymentSearchResult());
  }

  @Then("Relevant search results should be displayed")
  public void relevant_search_results_should_be_displayed() {
    assertEquals(DataUtils.EXPECTED_PRODUCT_SEARCH_RESULT, supportPage.getSearchResult());
  }

  @And("End the session")
  public void end_the_session() {
    driver.close();
  }

  @Then("Verify support page categories")
  public void verify_support_page_categories() {
    assertEquals(DataUtils.EXPECTED_OVERVIEW_ITEM_TEXT, supportPage.getOverViewItemText());
    assertEquals(DataUtils.EXPECTED_GETTING_STARTED_TEXT, supportPage.getGettingStartedItemText());
    assertEquals(DataUtils.EXPECTED_TEAM_MANAGEMENT_TEXT, supportPage.getTeamManagementItemText());
    assertEquals(DataUtils.EXPECTED_PROFILE_SETTINGS_TEXT, supportPage.getProfileAndSettingsItemText());
    assertEquals(DataUtils.EXPECTED_WIRE_ITEM_TEXT, supportPage.getUsingWireItemText());
    assertEquals(DataUtils.EXPECTED_SETUP_WIRE_TEXT, supportPage.getSetUpWireItemText());
    assertEquals(DataUtils.EXPECTED_CONFERENCING_ITEM_TEXT, supportPage.getConferencingItemText());
    assertEquals(DataUtils.EXPECTED_SECURITY_ITEM_TEXT, supportPage.getPrivacyAndSecurityItemText());
  }

  @Then("Click on header sign in link")
  public void click_on_header_sign_in_link() {
    supportPage.clickOnLoginLink();
  }

  // Step definitions for submit request page

  @When("Click on header menu submit request link")
  public void click_on_header_menu_submit_request_link() {
    supportPage.clickOnSubmitRequestMenuLink();
  }

  @Then("Submit request page should be displayed")
  public void submit_request_page_should_be_displayed() {
    assertEquals(DataUtils.EXPECTED_SUBMIT_REQUEST_PAGE_TITLE, submitRequestPage.getSubmitRequestPageTitleText());
    String URL = driver.getCurrentUrl();
    assertEquals(URL, DataUtils.SUBMIT_REQUEST_PAGE_URL);
  }

  @When("Select an issue from dropdown menu")
  public void select_an_issue_from_dropdown() {
    submitRequestPage.selectIssue();
  }

  @Then("Provide all the data in input fields")
  public void provide_all_the_data_in_input_fields() {
    submitRequestPage.enterEmailAddress(DataUtils.EMAIL);
    submitRequestPage.selectAccountType(DataUtils.ACCOUNT_TYPE);
    submitRequestPage.enterTeamId(DataUtils.TEAM_ID);
    submitRequestPage.enterSubject(DataUtils.SUBJECT);
    submitRequestPage.enterDescription(DataUtils.DESCRIPTION);
  }

  @Then("Upload a file")
  public void upload_a_file() {
    submitRequestPage.uploadAFile(DataUtils.IMAGE_PATH);
  }

  @And("Verify file is uploaded")
  public void verify_file_is_uploaded() {
    submitRequestPage.verifyFileIsUploaded();
  }

  @Then("Click on submit request button")
  public void click_on_submit_request_button() {
    submitRequestPage.clickOnSubmitButton();
  }

}
