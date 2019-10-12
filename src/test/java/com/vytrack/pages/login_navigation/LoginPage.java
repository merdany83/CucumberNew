package com.vytrack.pages.login_navigation;

import com.vytrack.utils.ConfigurationReader;
import com.vytrack.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    static private WebDriver driver =Driver.getDriver();
    private WebDriverWait wait= new WebDriverWait(driver,10);

    @FindBy (id="prependedInput")
    public WebElement usernameElement;

    @FindBy (id="prependedInput2")
    public WebElement passwordElement;

    @FindBy(id="_submit")
    public WebElement loginButtonElement;

    @FindBy(tagName="h2")
    public WebElement titleElement;

    @FindBy(css = "[class='alert alert-error']>div")
    public WebElement errorMessageElement;

    @FindBy(css="[class='custom-checkbox__icon']")
    public WebElement rememberMeElement;

    @FindBy(partialLinkText = "Forgot your password?")
    public WebElement forgotPasswordElement;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    public void login(String username,String password){
        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();

    }
    public String getErrormessage(){

        return errorMessageElement.getText();
    }


    public void clickRememberMe(){
       wait.until(ExpectedConditions.elementToBeClickable(rememberMeElement));
       if (!rememberMeElement.isSelected()){
            rememberMeElement.click();}
    }

    public void goToLadingPAge(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
    }


}


