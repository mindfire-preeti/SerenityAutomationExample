package com.serenity.Javascript;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class JavascriptTest  {

	@Managed
	WebDriver driver;
	JavascriptPage JS;
	
	@Test
	public void tc_1() throws InterruptedException
	{
	 
	 //JS.identifyElemntWithJS();
	 JS.printTextFromAllLinks();
	}



}
