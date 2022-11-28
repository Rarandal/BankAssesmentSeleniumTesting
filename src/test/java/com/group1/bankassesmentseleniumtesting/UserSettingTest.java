package com.group1.bankassesmentseleniumtesting;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UserSettingTest {
    public static void userSettingTest(){
        $("button[data-test='Sign in']").click();

        $("[data-test='username-input']").sendKeys("solera@solera.com");
        $("[data-test='password-input']").sendKeys("bootcamp4");

        $("button[data-test='Login']").click();

        $("[data-test='my_account_button']").click();

        $("[data-test='first-name']").sendKeys("Solera");
        $("[data-test='email']").sendKeys("solera@solera.com");
        $("[data-test='phoneNumber']").sendKeys("000-000-0000");

        $("button[data-test='save']").click();
    }
}
