package com.serenity.webelement.CheckBoxes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class CheckBoxesTest {


	@Managed
	WebDriver driver;
	CheckBoxesPage ch;
	
	@Test
	public void tc_1() throws InterruptedException
	{
	  ch.selectCheckBox();
	  Thread.sleep(3000);
	}
}
