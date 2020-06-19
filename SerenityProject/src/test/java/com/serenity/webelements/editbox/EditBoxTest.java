package com.serenity.webelements.editbox;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class EditBoxTest {

@Managed
WebDriver driver;
EditBoxPage editbox;

@Test
public void tc_1()
{
 editbox.editBoxtest();
// editbox.editBoxTypeExample();
// editbox.editBoxTypeAndTabExample();
 
}

}
