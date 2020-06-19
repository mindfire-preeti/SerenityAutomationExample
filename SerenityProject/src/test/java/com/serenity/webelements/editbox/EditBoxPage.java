package com.serenity.webelements.editbox;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("/login")
public class EditBoxPage extends PageObject {

@FindBy(id="username")
private WebElementFacade username;

@FindBy(id="password")
private WebElementFacade password;

public void editBoxtest()
{
	open();
    username.sendKeys("tomsmith");
    password.sendKeys("SuperSecretPassword!");
}

public void editBoxTypeExample()
{
	open();
	// Type method is used to first clear the text and then enter the text 
	username.type("tomsmith");
	password.sendKeys("SuperSecretPassword!");
}

public void editBoxTypeAndTabExample()
{
	open();
	// TypeAndTab  method is used to first clear the text and then enter the text
	// TypeAndEnter method is used type the text and then  hit enter.
	username.typeAndTab("tomsmith");
	password.typeAndEnter("SuperSecretPassword!");
}



}
