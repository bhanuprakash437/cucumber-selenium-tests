package utilities;

public class DataUtils {

  //Please provide chrome driver path and attachments path from resources folder

  final static String CHROME_DRIVER_PATH = "/Users/bhanufs/cucumber-selenium-tests/src/main/resources/drivers/chromedriver";
  public static final String IMAGE_PATH = "/Users/bhanufs/cucumber-selenium-tests/src/main/resources/images/testImage.png";

  public static final String SUBMIT_REQUEST_PAGE_URL = "https://support.wire.com/hc/en-us/requests/new";

  // Support page faq items
  public static final String EXPECTED_PAGE_TITLE = "Wire Help";
  public static final String EXPECTED_OVERVIEW_ITEM_TEXT = "Overview";
  public static final String EXPECTED_GETTING_STARTED_TEXT = "Getting started";
  public static final String EXPECTED_TEAM_MANAGEMENT_TEXT = "Team Management";
  public static final String EXPECTED_PROFILE_SETTINGS_TEXT = "Profile & Settings";
  public static final String EXPECTED_WIRE_ITEM_TEXT = "Using Wire";
  public static final String EXPECTED_SETUP_WIRE_TEXT = "Set up Wire";
  public static final String EXPECTED_CONFERENCING_ITEM_TEXT = "Conferencing";
  public static final String EXPECTED_SECURITY_ITEM_TEXT = "Privacy & Security";

  // Support page search and answers
  public static final String EXPECTED_SECURITY_SEARCH_RESULT = "24 results for \"security\"";
  public static final String EXPECTED_ARTICLE_HEADLINE = "Security Overview";
  public static final String EXPECTED_PAYMENT_SEARCH_RESULT = "No results for \"payment\"";
  public static final String EXPECTED_PRODUCT_SEARCH_RESULT = "5 results for \"product\"";

  // Submit request page relevant data
  public static final String EXPECTED_SUBMIT_REQUEST_PAGE_TITLE = "Submit a request";
  public static final String EMAIL = "testuser@gmail.com";
  public static final String ACCOUNT_TYPE = "Wire Personal";
  public static final String TEAM_ID = "None";
  public static final String SUBJECT = "Testing Purposes";
  public static final String DESCRIPTION = "I would like to know more details please";

}
