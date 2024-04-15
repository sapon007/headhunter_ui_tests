package pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Attachments;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private static final SelenideElement
            mainSearch = $("[data-qa=search-input]"),
            searchButton = $("[data-qa=search-button]"),
            modalClose = $("[data-qa=bloko-modal-close]"),
            loginBtn = $("[data-qa=login]");
    private Attachments attachments = new Attachments();

    @Step("Открыть главную страницу")
    public MainPage openPage() {
        open("/");
        return this;
    }

    @Step("Ввести поисковый запрос")
    public MainPage setSearchQuery(String value) {
        mainSearch.setValue(value);
        return this;
    }

    @Step("Нажать на кнопку \"Найти работу\"")
    public MainPage clickOnTheSearchButton() {
        searchButton.click();
        attachments.takeScreenshot();
        return this;
    }

    @Step("Закрыть модальное окно регистрации")
    public void closeModal() {
        modalClose.click();
    }

    @Step("Кликнуть на кнопку \"Войти\"")
    public void clickOtLoginBtn() {
        loginBtn.click();
    }
}
