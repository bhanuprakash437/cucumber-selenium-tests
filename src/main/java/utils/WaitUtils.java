package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

  public static void waitForElement(WebDriver driver, final WebElement element, long timeOutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
    wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(element)));
  }

}
