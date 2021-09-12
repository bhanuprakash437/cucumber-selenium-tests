package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportPage extends BaseClass {

  public WebDriver driver;

  public SupportPage(WebDriver ldriver) {
    driver = ldriver;
    PageFactory.initElements(ldriver, this);
  }

  @FindBy(xpath = "/html/body/div[1]/main/section/div/h1")
  @CacheLookup
  WebElement supportPageTitle;

  @FindBy(id = "query")
  @CacheLookup
  WebElement searchField;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/section/header/h1")
  @CacheLookup
  WebElement searchResult;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/section/ul/li[1]/h3/a")
  @CacheLookup
  WebElement resultLink;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/article/header/h1")
  @CacheLookup
  WebElement articleHeadline;

  @FindBy(xpath = "//*[@id=\"query\"]")
  @CacheLookup
  WebElement resultsSearchField;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/section/header/h1")
  @CacheLookup
  WebElement paymentSearchResult;

  @FindBy(xpath = "//*[@id=\"primary-nav\"]/li[2]/a")
  @CacheLookup
  WebElement loginLink;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/div/ul/li[1]/a/h2")
  @CacheLookup
  WebElement overviewItem;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/div/ul/li[2]/a/h2")
  @CacheLookup
  WebElement gettingStartedItem;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/div/ul/li[3]/a/h2")
  @CacheLookup
  WebElement teamManagementItem;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/div/ul/li[4]/a/h2")
  @CacheLookup
  WebElement profileAndSettingsItem;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/div/ul/li[5]/a/h2")
  @CacheLookup
  WebElement usingWireItem;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/div/ul/li[6]/a/h2")
  @CacheLookup
  WebElement setUpWireItem;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/div/ul/li[7]/a/h2")
  @CacheLookup
  WebElement conferencingItem;

  @FindBy(xpath = "//*[@id=\"page-container\"]/div/div/ul/li[8]/a/h2")
  @CacheLookup
  WebElement privacyAndSecurityItem;

  @FindBy(xpath = "//*[@id=\"primary-nav\"]/li[1]/a")
  @CacheLookup
  WebElement submitRequestMenuLink;

  public String getSupportPageTitleText() {
    return supportPageTitle.getText();
  }

  public void searchQuestion(String keyWord) {
    searchField.click();
    searchField.sendKeys(keyWord);
    searchField.sendKeys(Keys.RETURN);
  }

  public String getSearchResult() {
    return searchResult.getText();
  }

  public void clickOnResultLink() {
    resultLink.click();
  }

  public String articleShouldBeDisplayed() {
    return articleHeadline.getText();
  }

  public void searchAnotherQuestion(String word) {
    resultsSearchField.isDisplayed();
    resultsSearchField.click();
    resultsSearchField.sendKeys(word);
    resultsSearchField.sendKeys(Keys.RETURN);
  }

  public String getPaymentSearchResult() {
    return paymentSearchResult.getText();
  }

  public void clickOnLoginLink() {
    loginLink.isDisplayed();
    loginLink.click();
  }

  public String getOverViewItemText() {
    return overviewItem.getText();
  }

  public String getGettingStartedItemText() {
    return gettingStartedItem.getText();
  }

  public String getTeamManagementItemText() {
    return teamManagementItem.getText();
  }

  public String getProfileAndSettingsItemText() {
    return profileAndSettingsItem.getText();
  }

  public String getUsingWireItemText() {
    return usingWireItem.getText();
  }

  public String getSetUpWireItemText() {
    return setUpWireItem.getText();
  }

  public String getConferencingItemText() {
    return conferencingItem.getText();
  }

  public String getPrivacyAndSecurityItemText() {
    return privacyAndSecurityItem.getText();
  }

  public void clickOnSubmitRequestMenuLink() {
    submitRequestMenuLink.isDisplayed();
    submitRequestMenuLink.click();
  }

}
