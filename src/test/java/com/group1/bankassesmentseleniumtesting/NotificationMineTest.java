package com.group1.bankassesmentseleniumtesting;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class NotificationMineTest {

	public static void notificationMineTest() {
		
		open("/personal");
		$$("tarjeta");
		$("input[data-test='user-name]'").shouldHave(attribute("value","name"));
		$("input[data-test='user-surname]'").shouldHave(attribute("value","surName"));
		$("input[data-test='user-email]'").shouldHave(attribute("value","email"));
		$("input[data-test='user-name]'").shouldHave(attribute("value","phoneNumber"));
		
	}
	
	

}

