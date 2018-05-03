import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UnitTest extends ResursConstant {

    private static  String PROPERTYKEY = "webdriver.chrome.driver";
    private static  String WAYDRIVER = "C:\\Users\\КЛАС\\IdeaProjects\\Test\\drivers\\chromedriver.exe";
    private static  String WEBWAY = "http://newtours.demoaut.com";

    public static void main(String[] args) {
        startProp();
        unitTest();
        end();
    }

    private static void startProp() {
        System.setProperty(PROPERTYKEY, WAYDRIVER);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
        driver.get(WEBWAY);
    }

    private static void unitTest() {
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
    private static void end(){
        driver.quit();
    }
}