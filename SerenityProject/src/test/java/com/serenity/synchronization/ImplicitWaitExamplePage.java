package com.serenity.synchronization;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
//import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ImplicitWaitExamplePage extends PageObject {




@FindBy(xpath ="//button[text()=\"Start\"]")
 private WebElementFacade startButton;

public ImplicitWaitExamplePage(WebDriver driver) {
	super();
}
public void implicitExample()
{
	open();
	//setImp
 //  setImplicitTimeout(8,TimeUnit.SECONDS);
	System.out.println(getImplicitWaitTimeout().toString());
    startButton.click();
}





}
