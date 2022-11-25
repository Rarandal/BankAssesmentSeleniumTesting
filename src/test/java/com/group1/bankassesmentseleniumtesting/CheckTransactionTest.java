package com.group1.bankassesmentseleniumtesting;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;import java.awt.Button;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CheckTransactionTest {

	public static void checkTransactionTest() {
		
		open("/dataEntry");
		$("button[data-test='data-entry']").click();
		assertEquals("http://localhost:3000/user/settings",WebDriverRunner.getWebDriver().getCurrentUrl());
		
		
	}

}
