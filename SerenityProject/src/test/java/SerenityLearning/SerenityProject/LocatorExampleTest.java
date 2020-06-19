package SerenityLearning.SerenityProject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LocatorExampleTest {

	@Managed
	WebDriver driver;
	LocatorExamplePage page;

@Test
public void tc1() throws InterruptedException
{
	//page.ser_clikcLink();
	page.ser_getAllLinks();
}


}
