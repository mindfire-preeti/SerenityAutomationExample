package com.serenity.webelements.Dropdown;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.components.Dropdown;

@DefaultUrl("/dropdown")
public class DropDownPage extends PageObject {


@FindBy(id="dropdown")
 private WebElementFacade dropdownid;


public void selectDropdownValue() 
{
	open();
	//Dropdown.forWebElement(dropdownid).selectByValue("2");
	selectFromDropdown(dropdownid, "Option 2");
	System.out.println(getSelectedLabelFrom(dropdownid));
}

}
