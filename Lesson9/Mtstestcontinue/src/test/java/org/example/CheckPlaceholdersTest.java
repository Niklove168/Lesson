package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CheckPlaceholdersTest {
    private static WebDriver driver;

    @BeforeAll
    static void setupAll() {
        driver = new ChromeDriver();
    }

    @BeforeEach
    void setupEach() {
        driver.get("https://www.mts.by/");
    }


    @Test
    @Description(value = "Проверить плейсхолдеры в блоке Услуги связи")
    void CheckPlaceholders1() {
        Сommunicationservice placeholder1 = new Сommunicationservice(driver);
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


    @Test
    @Description(value = "Проверить плейсхолдеры в блоке Домашний интернет")
    void CheckPlaceholders2() {
        HomeInternet placeholder2 = new HomeInternet(driver);
        HomeInternet click = new HomeInternet(driver);
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


    @Test
    @Description(value = "Проверить плейсхолдеры в блоке Рассрочка")
    void CheckPlaceholders3() {
        Installmentplan placeholder3 = new Installmentplan(driver);
        Installmentplan click3 = new Installmentplan(driver);
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

    @Test
    @Description(value = "Проверить плейсхолдеры в блоке Задолженность")
    void CheckPlaceholders4() {
        Arrear placeholder4 = new Arrear(driver);
        Arrear click4 = new Arrear(driver);
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

    @AfterAll
    static void quitAll() {
        driver.quit();
    }
}