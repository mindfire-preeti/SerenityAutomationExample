package com.serenity.tables;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)

public class TableTest {


    @Managed
	WebDriver driver;
	TablePage table;

@Test
public void tc_1()
{
	//table.readCompleteTable();
	//table.extractRowFromTable();
//	table.extractTableheadings();
	//table.extractAllRows();
	//table.readValuesfromtableWithoutHeadings();
	table.assertOnTableElements();
}






}
