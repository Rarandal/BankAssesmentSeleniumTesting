package com.group1.bankassesmentseleniumtesting;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.WebDriverRunner;

public class BankAccountCreateTest {
	public static void bankAccountCreateTest(){
		open("/BankAccount");
        $("button[data-test='Create-Account']").click();
        
    }

}
