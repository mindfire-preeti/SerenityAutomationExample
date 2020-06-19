package com.serenity.MouseActions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class MouseActionsTest {
	
	
	@Managed
	WebDriver driver;
	MouseActionsPage mouse;
	
	@Test
	public void tc_1() throws InterruptedException
	{
	 mouse.mouseHoverExample();
	}

}
