package com.group1.bankassesmentseleniumtesting;

import com.codeborne.selenide.WebDriverRunner;
import org.jetbrains.annotations.TestOnly;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterTest {
    @TestOnly
    public static void registerTest(){
        $("[data-test='first-name']").sendKeys("Solera");
        $("[data-test='last-name']").sendKeys("solera");
        $("[data-test='username']").sendKeys("solera@solera.com");
        $("[data-test='password']").sendKeys("bootcamp4");
        $("[data-test='confirm-password']").sendKeys("bootcamp4");

        $("button[data-test='Register']").click();

        $("[data-test='home-label']");


    }
}
