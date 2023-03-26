package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FBHomePage {

    public WebDriver driver;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Home')]")
    public WebElement home;

    public FBHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //a[contains(text(),'Home')]


}
