package com.serenity.synchronization;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class WaitTest {

	  @Managed
		WebDriver driver;
		ImplicitWaitExamplePage implicit;
		ExplicitWaitExamplePage explicit;


@Test
public void tc_1()
{
	//implicit.implicitExample();
	explicit.explicitWaitExample();
}


}
