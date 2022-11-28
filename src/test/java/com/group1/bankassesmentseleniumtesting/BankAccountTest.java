package com.group1.bankassesmentseleniumtesting;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BankAccountTest {
	
	public static void bankAccountTest() {
		$("button[data-test='Sign in']").click();

		$("[data-test='username-input']").sendKeys("solera@solera.com");
		$("[data-test='password-input']").sendKeys("bootcamp4");

		$("button[data-test='Login']").click();

		$("[data-test='bankAccount-sidebar']").click();

		$("button[data-test='Create-Account']");
		$("button[data-test='Delete-Account']");
		
		
	}

}
