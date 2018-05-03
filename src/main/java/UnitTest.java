import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UnitTest extends ResursConstant {

    private static  String PROPERTYKEY = "webdriver.chrome.driver";
    private static  String WAYDRIVER = "drivers\\chromedriver.exe";
    private static  String WEBWAY = "http://newtours.demoaut.com";

    @Before
    public void startProp() {
        System.setProperty(PROPERTYKEY, WAYDRIVER);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
        driver.get(WEBWAY);
    }

    @Test
    public void unitTest() {

//step1
        StartPage.start();
//step2
        FindAFlight.start();
//step3
        SelectAFlight.start();
//step4
        BookAFlight.start();
//step5
        FlightConfirmation.start();
    }

    @After
    public void end(){
        driver.quit();
    }
}
