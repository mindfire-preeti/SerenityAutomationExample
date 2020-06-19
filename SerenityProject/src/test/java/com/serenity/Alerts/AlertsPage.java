package com.serenity.Alerts;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/javascript_alerts")
public class AlertsPage extends PageObject {

	@FindBy(xpath="//button[text()=\"Click for JS Alert\"]")
	public WebElementFacade regularJSAlert;

	@FindBy(xpath="//button[text()=\"Click for JS Confirm\"]")
	public WebElementFacade confirmJSAlert;

	@FindBy(xpath="//button[text()=\"Click for JS Prompt\"]")
	public WebElementFacade promptJSAlert;


	public void regulartAlertHanlding()
	{
		open();
		regularJSAlert.click();
		getAlert().accept();


	}
	public void confirmAlertHanlding()
	{
		open();
		confirmJSAlert.click();
		getAlert().dismiss();


	}

	public void promptAlertHanlding()
	{
		open();
		promptJSAlert.click();
		getAlert().sendKeys("Hello world");
		getAlert().accept();


	}

}
