package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {
    private static WebDriver driver;

    @BeforeAll
    static void setupAll() {
        driver = new ChromeDriver();
    }

    @BeforeEach
    void setupEach() {
        driver.get("https://www.mts.by/");
    }

    @DisplayName("Test1" + "Проверить название указанного блока")
    @Test
    void blockName() {
        Test1 name = new Test1(driver);
        String expected = "Онлайн пополнение\nбез комиссии";
        String actual = name.getPayWrapper().getText();
        assertEquals(expected, actual, "Текст блока не совпадает");
    }

    @DisplayName("Test2" + "Проверить наличие логотипов платёжных систем")
    @Test
    void logo() {
        Test2 img = new Test2(driver);
        assertTrue(img.getVisaLogo().isDisplayed(), "Изображение Visa не отображается");
        assertTrue(img.getVerifiedByVisaLogo().isDisplayed(), "Изображение Verified By Visa не отображается");
        assertTrue(img.getMasterCardLogo().isDisplayed(), "Изображение Mastercard не отображается");
        assertTrue(img.getMasterCardSecureCodeLogo().isDisplayed(), "Изображение Mastercard Secure code не отображается");
        assertTrue(img.getBelkartLogo().isDisplayed(), "Изображение Belcard не отображается");
    }

    @DisplayName("Test3" + "Проверить работу ссылки «Подробнее о сервисе»")
    @Test
    void url() {
        Test3 clickUrl = new Test3(driver);
        clickUrl.clickLink();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        assertEquals(actualUrl, expectedUrl, "URL не работает");
    }

    @ParameterizedTest
    @DisplayName("Test4" + "Заполнить поля и проверить работу кнопки «Продолжить» (проверяем только вариант «Услуги связи», номер для теста 297777777)")
    @CsvSource({"297777777, 100, 1nik1996@mail.ru"})
    void blockForpaying(String phoneNumber, String sum, String email) {
        Test4 test4 = new Test4(driver);
        test4.enterDataAndContinue(phoneNumber, sum, email);
        new Actions(driver).moveToElement(test4.Button()).click().perform();
        assert test4.Button().isEnabled() : "Кнопка 'Продолжить' не активна после ввода данных";
    }

    @AfterEach
    public void closeEach() {
        driver.close();
    }

    @AfterAll
    static void quitAll() {
        driver.quit();
    }
}