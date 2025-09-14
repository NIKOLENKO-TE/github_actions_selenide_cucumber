package ilcarro.stepDefinitions;

import ilcarro.core.BasePage;
import ilcarro.pages.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginPageSteps {
    @And("User enter valid data")
    public void userEnterValidCredentials() {
        new LoginPage().enterCredentials("test_qa@gmail.com", "Password@1");
    }

    @And("User clicks on Yalla button")
    public void userClickOnYallaButton() {
        new LoginPage().clickOnYallaButton();
    }

    @Then("User check the display of the message about successful login")
    public void userCheckTheDisplayOfTheMessageAboutSuccessfulLogin() {
        new LoginPage().verifyTextMessage("Logged in success");
    }

    @And("User closes browser")
    public void userClosesBrowser() {
        new BasePage().quitBrowser();
    }

    }
