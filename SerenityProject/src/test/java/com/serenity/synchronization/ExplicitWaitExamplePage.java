package com.serenity.synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("//dynamic_loading/2")
public class ExplicitWaitExamplePage  extends PageObject{

	@FindBy(xpath ="//button[text()=\"Start\"]")
	 private WebElementFacade startButton;

	public ExplicitWaitExamplePage(WebDriver driver) {
		super();
	}
	public void explicitWaitExample()
	{
		open();
	 startButton.withTimeoutOf(10, TimeUnit.SECONDS).click();
	 
	 waitFor(startButton).click();
	}

}
