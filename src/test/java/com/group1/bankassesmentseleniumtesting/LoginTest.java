package com.group1.bankassesmentseleniumtesting;

import com.codeborne.selenide.WebDriverRunner;
import org.jetbrains.annotations.TestOnly;

import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {
    @TestOnly
    public static void loginTest(){
        $("button[data-test='Sign in']").click();

        $("[data-test='username-input']").sendKeys("solera@solera.com");
        $("[data-test='password-input']").sendKeys("bootcamp4");

        $("button[data-test='Login']").click();

        $("[data-test='home-label']");
    }
}
