package com.serenity.tables;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.components.HtmlTable;

// Static imports  for table
import static net.thucydides.core.pages.components.HtmlTable.*;
import static org.hamcrest.Matchers .* ;
import static   net.thucydides.core.matchers.BeanMatchers .* ;


@DefaultUrl("/tables")
public class TablePage extends PageObject {

	@FindBy(how = How.ID , using = "table2")
	protected WebElementFacade table;


	// Will read the  complete table as Key and value pairs using HtmlTable class in serenity
	// rowsFrom function 

	public void  readCompleteTable()
	{
		open();
		List<Map<Object, String>> tbl = HtmlTable.rowsFrom(table);
		//System.out.println(tbl);

	}
	// This method will etxract the rows from table based on specified conditions 
	public void  extractRowFromTable()
	{
		List<WebElement> rowvalues= filterRows(table, the("Email", endsWith("yahoo.com")));
		for(WebElement e: rowvalues)
		{
			System.out.println(e.getText());
		}

	}

	// This method extracts all the table headings and print the same
	public void extractTableheadings()

	{
		open();

		List<String> headings= inTable(table).getHeadings();
		for(String h:headings)
			System.out.println(h);

	}
	// This method extracts all the rows except table headings and print the same
	public void extractAllRows()

	{
		open();

		List<WebElement> rows= inTable(table).getRowElements();
		for(WebElement e :rows)
		{
			System.out.println(e.getText());
		}
	}

    // Read rows from the table which do not have any headings
	 public void readValuesfromtableWithoutHeadings()
	 {
		 open();
		 List<Map<Object, String>>  tab1= withColumns("Last Name " ,"First Name","Email", "Due" , "Web Site" , "My Test") 
				 .readRowsFrom(table);
		 System.out.println(tab1);
	 }

  // This method is  is used to  check on certain values inside the table
	 public void assertOnTableElements()
  {
	  open();
	  inTable(table).shouldHaveRowElementsWhere(the("First name" , equalTo("Frank")));
  }

}







