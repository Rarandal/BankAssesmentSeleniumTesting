package com.group1.bankassesmentseleniumtesting;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BankAccountTest {
	
	public static void bankAccountTest() {
		open("/BankAccount");
		$("button[data-test='Create-Account']");
		$("button[data-test='Delete-Account']");
		
		
	}

}
