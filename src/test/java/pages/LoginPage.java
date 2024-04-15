package pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Attachments;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final SelenideElement
            emailOrMobileInput = $("[data-qa=account-signup-email]"),
            errorField = $("div.bloko-form-error"),
            continueBtn = $("[data-qa=account-signup-submit]");
    private Attachments attachments = new Attachments();

    @Step("Заполнить поле ввода электронной почты или телефона")
    public LoginPage setEmailOrMobile(String value) {
        emailOrMobileInput.setValue(value);
        return this;
    }

    @Step("Нажать \"Продолжить\"")
    public LoginPage clickOnContinueBtn() {
        continueBtn.click();
        attachments.takeScreenshot();
        return this;
    }

    @Step("Проверить выведенную ошибку")
    public void checkErrorMessage() {
        errorField.shouldHave(text("Пожалуйста, укажите email или телефон"));
    }
}
