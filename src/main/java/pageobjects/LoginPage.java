package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public static WebDriver driver;
    @FindBy(css = "input[id='user_email']")
    public WebElement email1;
    @FindBy(css = "input[type='password']")
    public WebElement passowrd1;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement login1;

    //input[@type='submit']
	
	
/* Interview Question Difference between @FindBys and @FindAll
 
	@FindBys : When the required WebElement objects need to match all of the given criteria use @FindBys annotation

	@FindAll : When required WebElement objects need to match at least one of the given criteria use @FindAll annotation

	Usage:

	@FindBys( {
	   @FindBy(className = "class1")
	   @FindBy(className = "class2")
	} )
	private List<WebElement> elementsWithBoth_class1ANDclass2;
	Here List elementsWithBothclass1ANDclass2 will contain any WebElement which satisfies both criteria.

	@FindAll({
	   @FindBy(className = "class1")
	   @FindBy(className = "class2")
	})
	private List<WebElement> elementsWithEither_class1ORclass2  
	Here List elementsWithEither_class1ORclass2 will contain all those WebElement that satisfies any one of the criteria.
	
	*/
    By email = By.cssSelector("input[id='user_email']");

    //PageFactory.initElements(driver, this);
    By password = By.cssSelector("input[type='password']");
    By login = By.xpath("//input[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;//this step is Not required

        PageFactory.initElements(driver, this); //Intialize all the locators and driver is test case object is assigning to current class object 'this'


    }

    public static void main(String args[]) {
        LoginPage l = new LoginPage(driver);


    }

    public WebElement getEmail() {
        return driver.findElement(email);
        //return email1
    }

    public WebElement getPassword() {
        return driver.findElement(password);
        //return password1
    }

    public WebElement getLogin() {
        return driver.findElement(login);
        //return login1
    }

    public WebElement getElement(By element) {


        return driver.findElement(element);

    }


}
