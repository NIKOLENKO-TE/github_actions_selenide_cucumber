package ilcarro.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    public void enterCredentials(String email, String password) {
        $("#email").setValue(email);
        $("#password").setValue(password);
    }

    public void clickOnYallaButton() {
        $(byXpath("//button[.='Y’alla!']")).click();
    }

    public void verifyTextMessage(String textToCheck) {
        $(".message").shouldHave(text(textToCheck));
        $x("//button[.='Ok']").click();
    }
}
