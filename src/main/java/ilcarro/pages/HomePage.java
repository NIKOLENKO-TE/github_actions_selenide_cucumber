package ilcarro.pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    public void openHomePage() {
        open("https://ilcarro.web.app/");
    }

    public void clickOnLoginLink() {
        $(byXpath("//a[.=' Log in ']")).click();
    }
}
