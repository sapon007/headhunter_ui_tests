package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;


public class LoginTests extends BaseTest {
    private MainPage mainPage = new MainPage();
    private LoginPage loginPage = new LoginPage();

    @Test
    @Feature("Авторизация")
    @DisplayName("В поле ввода электронной почты или телефона введено не корректное значение.")
    public void incorrectLogin() {
        mainPage
                .openPage()
                .clickOtLoginBtn();
        loginPage
                .setEmailOrMobile("123")
                .clickOnContinueBtn()
                .checkErrorMessage();
    }
}
