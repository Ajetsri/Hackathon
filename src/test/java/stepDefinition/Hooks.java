package stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import testBase.BaseClass;

public class Hooks {

	public static WebDriver driver=BaseClass.driver;
    
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        boolean b = scenario.isFailed();
        
        if (!b) {
        	// Attach the screenshot for passed steps
            scenario.attach(screenshot, "image/png", "PassedStepScreenshot");
        } else {
        	// Attach the screenshot for failed steps
            scenario.attach(screenshot, "image/png", "FailedStepScreenshot"); 
        }
    }
    @AfterAll
    public static void After_All()
    {
    	driver.quit();
    }

   
}
