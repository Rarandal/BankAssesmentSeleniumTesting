package com.group1.bankassesmentseleniumtesting;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("http://localhost:3000/");
    }

    @Test
    void loginTest(){
        LoginTest.loginTest();
    }

    @Test
    void registerTest(){
        RegisterTest.registerTest();
    }

    @Test
    void UserSettingTest(){
        UserSettingTest.userSettingTest();
    }

    @Test
    void BankAccountTest(){
        BankAccountTest.bankAccountTest();
    }

    @Test
    void BankAccountCreateTest(){
        BankAccountCreateTest.bankAccountCreateTest();
    }

    @Test
    void BankAccountDeleteTest(){
        BankAccountDeleteTest.bankAccountDeleteTest();
    }

    @Test
    void NotificationMineTest(){
        NotificationMineTest.notificationMineTest();
    }

    @Test
    void CheckTransactionTest(){
        CheckTransactionTest.checkTransactionTest();
    }
}

