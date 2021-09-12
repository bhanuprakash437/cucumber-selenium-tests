package pageobjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;


public class SubmitRequestPage extends BaseClass {

  private static final int TIMEOUT_IN_SECONDS = 5;

  public WebDriver driver;

  public SubmitRequestPage(WebDriver ldriver) {
    driver = ldriver;
    PageFactory.initElements(ldriver, this);
  }

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/div/header/h1")
  @CacheLookup
  WebElement submitRequestPageHeadline;

  @FindBy(xpath = "//*[@id=\"new_request\"]/div[1]/a")
  @CacheLookup
  WebElement selectIssueDropdown;

  @FindBy(id = "101635")
  @CacheLookup
  WebElement selectIssueType;

  @FindBy(id = "request_anonymous_requester_email")
  @CacheLookup
  WebElement emailInputField;

  @FindBy(xpath = "//*[@id=\"new_request\"]/div[3]/a")
  @CacheLookup
  WebElement accountTypeDropdown;

  @FindBy(id = "request_custom_fields_45452709")
  @CacheLookup
  WebElement teamIdInputField;

  @FindBy(id = "request_subject")
  @CacheLookup
  WebElement subjectInputField;

  @FindBy(id = "request_description")
  @CacheLookup
  WebElement descriptionInputField;

  @FindBy(id = "request-attachments")
  @CacheLookup
  WebElement attachmentsLink;

  @FindBy(xpath = "//*[@id=\"request-attachments-pool\"]/li")
  @CacheLookup
  WebElement uploadedItem;

  @FindBy(xpath = "//*[@id=\"new_request\"]/footer/input")
  WebElement submitButton;

  public String getSubmitRequestPageTitleText() {
    return submitRequestPageHeadline.getText();
  }

  public void selectIssue() {
    selectIssueDropdown.click();
    selectIssueType.click();
  }

  public void enterEmailAddress(String email) {
    WaitUtils.waitForElement(driver, emailInputField, TIMEOUT_IN_SECONDS);
    emailInputField.isDisplayed();
    emailInputField.sendKeys(email);
  }

  public void selectAccountType(String accountType) {
    accountTypeDropdown.click();
    accountTypeDropdown.sendKeys(accountType);
    accountTypeDropdown.sendKeys(Keys.RETURN);
  }

  public void enterTeamId(String teamId) {
    teamIdInputField.isDisplayed();
    teamIdInputField.sendKeys(teamId);
  }

  public void enterSubject(String subject) {
    subjectInputField.isDisplayed();
    subjectInputField.sendKeys(subject);
  }

  public void enterDescription(String description) {
    descriptionInputField.isDisplayed();
    descriptionInputField.sendKeys(description);
  }

  public void uploadAFile(String imagePath) {
    attachmentsLink.isDisplayed();
    attachmentsLink.sendKeys(imagePath);
  }

  public void verifyFileIsUploaded() {
    WaitUtils.waitForElement(driver, uploadedItem, TIMEOUT_IN_SECONDS);
    uploadedItem.isDisplayed();
  }

  public void clickOnSubmitButton() {
    submitButton.isDisplayed();
    //submitButton.click();
  }

}
