package com.group1.bankassesmentseleniumtesting;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BankAccountDeleteTest {
	public static void bankAccountDeleteTest(){
		open("/BankAccount");
        $("button[data-test='Delete-Account']").click();        

        
    }

}
