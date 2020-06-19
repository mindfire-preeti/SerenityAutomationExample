package com.serenity.webelement.CheckBoxes;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webelements.Checkbox;



@DefaultUrl("/checkboxes")
public class CheckBoxesPage  extends PageObject{

	@FindBy(xpath="//form[@id=\"checkboxes\"]//input[1]")
	 private WebElementFacade chkBox1;
	
	@FindBy(xpath="//form[@id=\"checkboxes\"]//input[2]")
	 private WebElementFacade chkBox2;
	
	



public void selectCheckBox()
{
	open();
	Checkbox checkbox= new Checkbox(chkBox1);
	// Set checked  method takes descion to select or deselct the webelement based on the current status of  webelement
	checkbox.setChecked(true);
	System.out.println(checkbox.isChecked());
	
}



}
