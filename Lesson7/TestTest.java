package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestTest {

    private static WebDriver driver;
    private TestPage testPage;

    @BeforeEach
     void setupAll() {
        driver = new ChromeDriver();
        driver.get(httpswww.mts.by);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains(mts.by));
    }

    @ParameterizedTest
    @DisplayName(Проверка текста суммы платежа с внесенным платежем, номера телефона с введенным телефоном, Оплатить 100.00 BYN на кнопке подтверждения в монадальном окне блока Услуга связи )
    @CsvSource({297777777, 100, 1nik1996@mail.ru})
    void SummNumberText(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        String expectedSumm = 100.00 BYN;
        String actualSumm = testPage.getCostNumber().getText();
        assertEquals(expectedSumm, actualSumm, Сумма платежа не совпадает с описанием);
        String expectedNumber = Номер375297777777;
        String actualNumber = testPage.getPhoneNumber().getText();
        assertEquals(expectedNumber, actualNumber, Номер телефона не совпадает с описанием);
        String expectedButtontext = Оплатить 100.00 BYN;
        String actualButtontext = testPage.getButtontextPrice().getText();
        assertEquals(expectedButtontext, actualButtontext, Текст 'Оплатить 100.00 BYN' не совпадает с описанием);
    }

    @ParameterizedTest
    @DisplayName(Проверка плейсхолдеров в монадальном окне блока Услуга связи )
    @CsvSource({297777777, 100, 1nik1996@mail.ru})
    void Placeholders(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        String expectedNumbercard = Номер карты;
        String actualNumbercard = testPage.getCardNumberPlaceholder().getText();
        assertEquals(expectedNumbercard, actualNumbercard, Номер карты не совпадает с описанием);
        String expectedValidity = Срок действия;
        String actualValidity = testPage.getValidityPlaceholder().getText();
        assertEquals(expectedValidity, actualValidity, Срок действия не совпадает с описанием);
        String expectedCvc = CVC;
        String actualCvc = testPage.getCvc().getText();
        assertEquals(expectedCvc, actualCvc, CVC не совпадает с описанием);
        String expectedNameCard = Имя держателя (как на карте);
        String actualNameCard = testPage.getNamecard().getText();
        assertEquals(expectedNameCard, actualNameCard, Имя держателя (как на карте) не совпадает с описанием);
    }

    @ParameterizedTest
    @DisplayName(Проверка лого MasterCard в монадальном окне блока Услуга связи )
    @CsvSource({297777777, 100, 1nik1996@mail.ru})
    void logo(String phoneNumber, String sum, String email) {
        testPage = new TestPage(driver);
        testPage.enterDataAndContinue(phoneNumber, sum, email);
        assertTrue(testPage.getImgMasterCard().isDisplayed(), Лого MasterCard не отображается);
        assertTrue(testPage.getImgVisa().isDisplayed(), Лого Visa не отображается);
        assertTrue(testPage.getImgBelcart().isDisplayed(), Лого Belcart не отображается);
        assertTrue(testPage.getImgmir().isDisplayed(), Лого Mir не отображается);
        assertTrue(testPage.getImgMaestro().isDisplayed(), Лого Maestro не отображается);
    }

    @AfterAll
    static void quitAll() {
        driver.close();
        driver.quit();
    }
}