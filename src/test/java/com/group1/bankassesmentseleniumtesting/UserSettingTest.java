package com.group1.bankassesmentseleniumtesting;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UserSettingTest {
    public static void userSettingTest(){
        $("button[data-test='Sign in']").click();

        $("[data-test='username-input']").sendKeys("solera@solera.com");
        $("[data-test='password-input']").sendKeys("bootcamp4");

        $("button[data-test='Login']").click();

        $("[data-test='user-sidebar']").click();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        $("[data-test='primero']").sendKeys("Solera");
        $("[data-test='segundo']").sendKeys("a");
        $("[data-test='tercero']").sendKeys("solera@solera.com");
        $("[data-test='cuarto']").sendKeys("000-000-0000");

        $("button[data-test='save']").click();
    }
}
