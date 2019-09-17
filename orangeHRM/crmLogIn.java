package orangeHRM;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class crmLogIn {
  private WebDriver driver;
  @DataProvider(name-"Authentication")

  public Object[][] credentials() {
    return new Object[][] {"testuser","Test@1" };
  }
  
  public void testw (String userName, String password) {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.xpath(""))
  }
}
