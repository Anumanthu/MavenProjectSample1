package academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LandingPage;
import resources.Base;

import java.io.IOException;

public class ValaidateNavigationBar extends Base {

    private static Logger log = LogManager.getLogger(ValaidateNavigationBar.class.getName());

    @BeforeMethod
    public void openUrl() throws IOException {
        driver = initializeDriver();
        log.info("Driver initialized");
        driver.get(url1);
        log.info("Opened url successfully");


    }

    @Test
    public void validateNavBar() throws IOException, Exception {
        LandingPage l = new LandingPage(driver);

        Thread.sleep(10000);

        driver.manage().window().maximize();

        Assert.assertTrue(l.navigationBar.isDisplayed());
        // Assert.assertTrue(false);

        log.info("Navigation bar Successfully displayed");

        // Assert.assertFalse(false);

    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();

        log.info("driver closed after test completed");

        driver = null;


    }


}
	


