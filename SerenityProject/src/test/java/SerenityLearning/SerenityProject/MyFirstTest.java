package SerenityLearning.SerenityProject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class MyFirstTest {

	@Managed
	WebDriver driver;
	@Test
	public void firstTest()
	{
		driver.navigate().to("https://www.google.com/");

	}


}
