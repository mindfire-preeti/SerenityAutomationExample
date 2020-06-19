package com.serenity.Alerts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class AlertsTest {

	@Managed
	WebDriver driver;
	AlertsPage alert;
	
	@Test
	public void tc_1() throws InterruptedException
	{
	 // alert.regulartAlertHanlding();
	  alert.promptAlertHanlding();
	 // alert.confirmAlertHanlding();
	  
	}



}
