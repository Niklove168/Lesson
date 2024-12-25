package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Test1Test {
    private static WebDriver driver;

    @BeforeAll
    static void setupAll() {
        driver = new ChromeDriver();
    }

    @BeforeEach
    void setupEach() {
        driver.get("https://www.mts.by/");
    }

    @DisplayName("Test1" + "Проверить плейсхолдеры в блоке Услуги связи")
    @Test
    void CheckPlaceholders1() {
        Test1 placeholder1 = new Test1(driver);
        String expectedNumber1 = "Номер телефона";
        String actualNumber1 = placeholder1.getNumber1Placeholder().getAttribute("placeholder");
        assertEquals(expectedNumber1, actualNumber1, "Надпись Номер телефона не отображается");
        String expectedSumm1 = "Сумма";
        String actualSumm1 = placeholder1.getSumm1Placeholder().getAttribute("placeholder");
        assertEquals(expectedSumm1, actualSumm1, "Надпись Сумма не отображается");
        String expectedEmail1 = "E-mail для отправки чека";
        String actualEmail1 = placeholder1.getEmail1Placeholder().getAttribute("placeholder");
        assertEquals(expectedEmail1, actualEmail1, "Надпись E-mail для отправки чека не отображается");
    }

    @DisplayName("Test2" + "Проверить плейсхолдеры в блоке Домашний интернет")
    @Test
    void CheckPlaceholders2() {
        Test2 placeholder2 = new Test2(driver);
        Test2 click = new Test2(driver);
        click.enterDataAndContinue1();
        String expectedNumber2 = "Номер абонента";
        String actualNumber2 = placeholder2.getNumber2Placeholder().getAttribute("placeholder");
        assertEquals(expectedNumber2, actualNumber2, "Надпись Номер абонента не отображается");
        String expectedSumm2 = "Сумма";
        String actualSumm2 = placeholder2.getSumm2Placeholder().getAttribute("placeholder");
        assertEquals(expectedSumm2, actualSumm2, "Надпись Сумма не отображается");
        String expectedEmail2 = "E-mail для отправки чека";
        String actualEmail2 = placeholder2.getEmail2Placeholder().getAttribute("placeholder");
        assertEquals(expectedEmail2, actualEmail2, "Надпись E-mail для отправки чека не отображается");
    }


    @DisplayName("Test3" + "Проверить плейсхолдеры в блоке Рассрочка")
    @Test
    void CheckPlaceholders3() {
        Test3 placeholder3 = new Test3(driver);
        Test3 click3 = new Test3(driver);
        click3.enterDataAndContinue2();
        String expectedNumber3 = "Номер счета на 44";
        String actualNumber3 = placeholder3.getNumberofScore().getAttribute("placeholder");
        assertEquals(expectedNumber3, actualNumber3, "Надпись Номер счета на 44 не отображается");
        String expectedSumm3 = "Сумма";
        String actualSumm3 = placeholder3.getSumm3Placeholder().getAttribute("placeholder");
        assertEquals(expectedSumm3, actualSumm3, "Надпись Сумма не отображается");
        String expectedEmail3 = "E-mail для отправки чека";
        String actualEmail3 = placeholder3.getEmail3Placeholder().getAttribute("placeholder");
        assertEquals(expectedEmail3, actualEmail3, "Надпись E-mail для отправки чека не отображается");
    }

    @DisplayName("Test4" + "Проверить плейсхолдеры в блоке Задолженность")
    @Test
    void CheckPlaceholders4() {
        Test4 placeholder4 = new Test4(driver);
        Test4 click4 = new Test4(driver);
        click4.enterDataAndContinue3();
        String expectedNumber4 = "Номер счета на 2073";
        String actualNumber4 = placeholder4.getNumber1ofScore().getAttribute("placeholder");
        assertEquals(expectedNumber4, actualNumber4, "Надпись Номер счета на 44 не отображается");
        String expectedSumm4 = "Сумма";
        String actualSumm4 = placeholder4.getSumm4Placeholder().getAttribute("placeholder");
        assertEquals(expectedSumm4, actualSumm4, "Надпись Сумма не отображается");
        String expectedEmail4 = "E-mail для отправки чека";
        String actualEmail4 = placeholder4.getEmail4Placeholder().getAttribute("placeholder");
        assertEquals(expectedEmail4, actualEmail4, "Надпись E-mail для отправки чека не отображается");
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