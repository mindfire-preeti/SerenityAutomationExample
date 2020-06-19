package com.serenity.MouseActions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/hovers")
public class MouseActionsPage  extends PageObject{


	@FindBy(xpath="(//div[@class=\"example\"]//img)[1]")
	private WebElementFacade image1;


	public void mouseHoverExample() throws InterruptedException
	{

		open();
		Thread.sleep(50000);
		withAction().moveToElement(image1).build().perform();

	}




}
