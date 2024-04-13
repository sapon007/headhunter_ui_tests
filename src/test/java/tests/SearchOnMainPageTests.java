package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.VacanciesPage;

public class SearchOnMainPageTests extends BaseTest {

    private MainPage mainPage = new MainPage();
    private VacanciesPage vacanciesPage = new VacanciesPage();

    @Test
    public void searchOnMainPageTest() {
        mainPage.openPage()
                .setSearchQuery("Тестировщик")
                .clickOnTheSearchButton();
        //mainPage.closeModal();
    }
}
