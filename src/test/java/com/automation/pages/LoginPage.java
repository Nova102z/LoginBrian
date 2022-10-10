package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.automation.utils.ConfigEnv.printEnv;

public class LoginPage extends BasePage {



    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "logIn")
    WebElement logInButton;

    @FindBy(xpath = "//a[contains(@class,'hudlLogoContainer')]")
    WebElement hudlLogo;

    @FindBy(className = "search-bar-container")
    WebElement searchBar;

    @FindBy(xpath = "//div[@class='hui-globaluseritem__display-name']")
    WebElement userMenu;

    @FindBy(xpath = "//span[text()='Log Out']")
    WebElement logOutButton;

    @FindBy(xpath = "//span[text()='Account Settings']")
    WebElement accountSettingButton;

    @FindBy(xpath = "//a[@class='mainnav__sitename']")
    WebElement homePageHudlLogo;

    @FindBy(id = "current_password")
    WebElement currentPasswordField;

    @FindBy(id = "confirm_password")
    WebElement confirmPasswordField;

    @FindBy(id = "save_basic")
    WebElement saveChangesButton;

    @FindBy(xpath = "//a[text()='Log in']")
    WebElement logInLink;

    public void userIsOnLoginPage() {
        driver.get(ConfigReader.getProperty("url"));
    }

    public void verifyUserIsOnLoginPage() {
        Assert.assertTrue("User is not in Hudl login page", hudlLogo.isDisplayed());
    }

    public void userEntersCorrespondingUsername() {
        //emailField.sendKeys(printEnv("HUSER"));
        emailField.sendKeys(ConfigReader.getProperty("chuser"));
    }

    public void userEntersCorrespondingPassword() {
        //passwordField.sendKeys(printEnv("HPASS"));
        passwordField.sendKeys(ConfigReader.getProperty("chpass"));
    }

    public void userClicksOnLoginButton() {
        logInButton.click();
    }

    public void verifyUserIsLoggedIn() {
        Assert.assertTrue("Not Logged in", searchBar.isDisplayed());
    }

    public void verifyUserIsNotLoggedIn() {
        Assert.assertTrue("User is not in Hudl Page", hudlLogo.isDisplayed());
    }

    public void userClicksOnDisplayName() {
        userMenu.click();
    }

    public void userClickOnLogOutLink(){
        logOutButton.click();
    }

    public void verifyLogInButtonIsDisplayed() {
        Assert.assertTrue("Login button is not there", logInButton.isDisplayed());
    }

    public void userEntersIncorrectCredentials(String invalidUsername, String invalidPassword) {
        emailField.sendKeys(invalidUsername);
        passwordField.sendKeys(invalidPassword);
    }

    public void verifyUserIsLoggedOut() {
        Assert.assertTrue("Not in homepage", homePageHudlLogo.isDisplayed());
    }

    public void userClicksOnAccountSetting() {
        accountSettingButton.click();
    }

    public void userEntersCurrentPassword(){
        //currentPasswordField.sendKeys(printEnv("HPASS"));
        currentPasswordField.sendKeys(ConfigReader.getProperty("chpass"));
    }

    public void userEntersNewPassword() {
        //passwordField.sendKeys(printEnv("NEWHPASS"));
        passwordField.sendKeys(ConfigReader.getProperty("chnpass"));
    }

    public void userConfirmsNewPassword() {
        //confirmPasswordField.sendKeys(printEnv("NEWHPASS"));
        confirmPasswordField.sendKeys(ConfigReader.getProperty("chnpass"));
    }

    public void userClickOnSaveChangesButton() {
        saveChangesButton.click();
    }

    public void hitEnterKeyToSignInAfterPasswordEntered() {
        //passwordField.sendKeys(printEnv("HPASS") + Keys.ENTER);
        passwordField.sendKeys(ConfigReader.getProperty("chpass") + Keys.ENTER);
    }

    public void verifyPasswordIsEncrypted() {
        //passwordField.sendKeys(printEnv("HPASS"));
        passwordField.sendKeys(ConfigReader.getProperty("chpass"));
        Assert.assertEquals("Not matching", passwordField.getText(), "");
        if (passwordField.getText().isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(passwordField.getText() + " Not empty");
        }
    }

    public void userEntersPasswordInUsernameField() {
        emailField.sendKeys(ConfigReader.getProperty("chpass"));
        //emailField.sendKeys(printEnv("HPASS"));
    }

    public void userEntersUsernameInPasswordField() {
        passwordField.sendKeys(ConfigReader.getProperty("chuser"));
        //passwordField.sendKeys(printEnv("HUSER"));
    }

    public void userClicksOnLoginLink(){
        logInLink.click();
    }


}
