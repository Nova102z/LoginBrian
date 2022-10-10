package com.automation.stepdef;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps {

    LoginPage loginPage = new LoginPage();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        loginPage.userIsOnLoginPage();
    }

    @Then("verify login button is present")
    public void verify_login_button_is_present() {
        loginPage.verifyLogInButtonIsDisplayed();
    }

    @Then("Verify user is on login page")
    public void verifyUserIsOnLoginPage() {
        loginPage.verifyUserIsOnLoginPage();
    }

    @When("User enters corresponding username")
    public void user_enters_corresponding_username() {
        loginPage.userEntersCorrespondingUsername();
    }

    @When("User enters corresponding password")
    public void user_enters_corresponding_password() {
        loginPage.userEntersCorrespondingPassword();
    }

    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.userClicksOnLoginButton();
    }

    @Then("Verify login is successful")
    public void verify_login_is_successful() {
        loginPage.verifyUserIsLoggedIn();
    }

    @Then("Verify login is unsuccessful")
    public void verify_login_is_unsuccessful() {
        loginPage.verifyUserIsNotLoggedIn();
    }

    @Then("User clicks on logout button")
    public void user_clicks_on_logout_button() {
        loginPage.userClickOnLogOutLink();
    }

    @Then("Verify logout is successful")
    public void verify_logout_is_successful() {
        loginPage.verifyUserIsLoggedOut();
    }

    @Then("User clicks on account settings")
    public void user_clicks_on_account_settings() {
        loginPage.userClicksOnAccountSetting();
    }

    @Then("User enters new password")
    public void user_enters_new_password() {
        loginPage.userEntersNewPassword();
    }

    @Then("User enters confirm new password")
    public void user_enters_confirm_new_password() {
        loginPage.userConfirmsNewPassword();
    }

    @Then("User clicks save changes")
    public void user_clicks_save_changes() {
        loginPage.userClickOnSaveChangesButton();
    }

    @Then("User presses enter key on their keyboard")
    public void user_presses_enter_key_on_their_keyboard() {
        loginPage.hitEnterKeyToSignInAfterPasswordEntered();
    }

    @Then("Verify password is encrypted")
    public void verify_password_is_encrypted() {
        loginPage.verifyPasswordIsEncrypted();
    }

    @When("User enters corresponding username in password field")
    public void user_enters_corresponding_username_in_password_field() {
        loginPage.userEntersUsernameInPasswordField();
    }

    @When("User enters corresponding password in username field")
    public void user_enters_corresponding_password_in_username_field() {
        loginPage.userEntersPasswordInUsernameField();
    }

    @When("User enters invalid username {string} and password {string}")
    public void userEntersInvalidUsernameAndPassword(String invalidUsername, String invalidPassword) {
        loginPage.userEntersIncorrectCredentials(invalidUsername, invalidPassword);
    }

    @Then("User clicks on login link")
    public void userClicksOnLoginLink() {
        loginPage.userClicksOnLoginLink();
    }

    @And("User click on display name")
    public void userClickOnDisplayName() {
        loginPage.userClicksOnDisplayName();
    }

    @And("User enters corresponding password and user hits enter")
    public void userEntersCorrespondingPasswordAndUserHitsEnter() {
        loginPage.hitEnterKeyToSignInAfterPasswordEntered();
    }

    @And("User enters current password")
    public void userEntersCurrentPassword() {
        loginPage.userEntersCurrentPassword();
    }
}
