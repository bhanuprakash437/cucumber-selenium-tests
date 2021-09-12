package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserProvider {

  public WebDriver driver;

  public static WebDriver getChromeWebDriver() {
    //Provides the webdriver instance

    System.setProperty("webdriver.chrome.driver", DataUtils.CHROME_DRIVER_PATH);
    WebDriver driver = new ChromeDriver();
    return driver;
  }

}
