package com.group1.bankassesmentseleniumtesting;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.WebDriverRunner;

public class BankAccountCreateTest {
	public static void bankAccountCreateTest(){
        $("button[data-test='Sign in']").click();

        $("[data-test='username-input']").sendKeys("solera@solera.com");
        $("[data-test='password-input']").sendKeys("bootcamp4");

        $("button[data-test='Login']").click();

        $("[data-test='bankAccount-sidebar']").click();

        $("button[data-test='Create-Account']").click();
        
    }

}
