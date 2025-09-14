package ilcarro.stepDefinitions;

import ilcarro.core.BasePage;
import ilcarro.pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps {
    @Given("User launches browser")
    public void userLaunchesBrowser() {
        new BasePage().launchBrowser();
    }

    @When("User opens homepage ilcarro")
    public void userOpensHomepageIlcarro() {
        // Write code here that turns the phrase above into concrete actions
        new HomePage().openHomePage();
    }

    @And("User clicks on Login link")
    public void userClicksOnLoginLink() {
        // Write code here that turns the phrase above into concrete actions
        new HomePage().clickOnLoginLink();
    }
}
