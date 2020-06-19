package com.serenity.Javascript;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class JavascriptPage extends PageObject {



public void identifyElemntWithJS() throws InterruptedException

{
	
	open();
	WebElement link= (WebElement) evaluateJavascript(" return document.querySelector(\"a[href='/abtest']\");");
	link.click();
	
}

public void printTextFromAllLinks()
{
	open();
	List<WebElement> allLinks= (List<WebElement>) evaluateJavascript("return document.getElementsByTagName(\"a\");");
	for (WebElement e: allLinks)
	{
		System.out.println(e.getText());
	}
	
}


}
