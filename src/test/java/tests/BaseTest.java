package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://hh.ru";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }
}
