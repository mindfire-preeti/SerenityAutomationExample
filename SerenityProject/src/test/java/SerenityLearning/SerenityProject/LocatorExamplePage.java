package SerenityLearning.SerenityProject;

import java.util.List;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;

public class LocatorExamplePage extends PageObject {

 public LocatorExamplePage(WebDriver driver) {
 
super() ;
}

	 public void ser_clikcLink() throws InterruptedException
{
	    open();
		 
	  //  WebElementFacade link= find(By.xpath("//a[@href='/abtest']"));
	    WebElementFacade link = $("//a[@href='/abtest']");
	    link.click();
	    Thread.sleep(2000);
}

 public void ser_getAllLinks() throws InterruptedException
 
 
 {
	 open();
	 List<WebElementFacade> links = findAll(By.tagName("a"));
     for (WebElementFacade	link:links) {
     System.out.println(link.getText().toUpperCase())	 ;
     }
    Thread.sleep(3000);
 }
 

}
