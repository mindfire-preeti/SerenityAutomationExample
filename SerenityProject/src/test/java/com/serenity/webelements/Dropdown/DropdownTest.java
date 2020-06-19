package com.serenity.webelements.Dropdown;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class DropdownTest {


	@Managed
	WebDriver driver;
	DropDownPage dropdown;
	
	@Test
	public void tc_1() throws InterruptedException
	{
		dropdown.selectDropdownValue();
		Thread.sleep(3000);
	}
	 



}
