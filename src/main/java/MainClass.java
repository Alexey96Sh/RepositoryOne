import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainClass {
    private static final String PROPERTYKEY = "webdriver.chrome.driver";
    private static final String WAYDRIVER = "C:\\Users\\КЛАС\\IdeaProjects\\Test\\drivers\\chromedriver.exe";
    private static final String WEBWAY = "http://newtours.demoaut.com";
    private static final String SINGINNAME = ".//input[@name = 'login']";
    private static final String USERNAME = "userName";
    private static final String TESTWORD = "test1";
    private static final String PASSWORDNAME = "password";
    private static final String WAYPARISTOSEATLE = "/html/body/div/table/tbody/"
            + "tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/"
            +"td[2]/table/tbody/tr[5]/td/form/table[1]"
            +"/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font";
    private static final String WAYDATEDEPORT = "/html/body/div/table/tbody/tr/"
    +"td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/"
    +"td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font";
    private static final String WAYSEATLETOPARIS = "/html/body/div/table/tbody/tr/"
    +"td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
    +"table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font";
    private static final String WAYDATERETURN = "/html/body/div/table/tbody/tr/"
    +"td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
    +"table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font";
    private static final String WAYDEPART = "/html/body/div/table/tbody/tr/td[2]/"
    +"table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/"
    +"tr[2]/td/table/tbody/tr[1]/td[1]/b/font";
    private static final String WAYDEPORTDATE = "/html/body/div/table/tbody/tr/td[2]/"
    +"table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/"
    +"tr[2]/td/table/tbody/tr[1]/td[2]/b/font";
    private static final String WAYFLIGHTDEPORT = "/html/body/div/table/tbody/tr/td[2]/table/"
    +"tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td"
    +"/table/tbody/tr[3]/td[1]/font/b";
    private static final String WAYCLASSDEPORT = "/html/body/div/table/tbody/tr/td[2]/table/"
    +"tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table"
    +"/tbody/tr[3]/td[2]/font";
    private static final String WAYPRICEDEPORT = "/html/body/div/table/tbody/tr/td[2]/table/"
    +"tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table"
    +"/tbody/tr[3]/td[3]/font";
    private static final String WAYRETURN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
    +"tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody"
    +"/tr[4]/td[1]/b/font";
    private static final String WAYRETURNDATE = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
    +"tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr"
    +"[4]/td[2]/b/font";
    private static final String WAYFLICHTRETURN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
    +"tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]"
    +"/td[1]/font/font/font[1]/b";
    private static final String WAYCLASSRETURN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
    +"tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/font";
    private static final String WAYPRICERETURN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table"
    +"/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td[3]/font";
    private static final String WAYPASSENGERS = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
    +"tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[7]/td[2]/font";
    private static final String WAYTAXESPRICE = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]"
    +"/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[8]/td[2]/font";
    private static final String WAYCOST = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/"
    +"tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[9]/td[2]/font/b";
    private static final String SAMECLICLWAY = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/"
            +"td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input";



    private static final String COUNTPASSEGERS = "2";
    private static final String CLASSNAME = "Business";
    private static final String DEPARTINGWAY = "Paris to Seattle";
    private static final String RETURNWAY = "Seattle to Paris";
    private static final String DATEDEPORT = "11/20/2018";
    private static final String FIRSTNAME = "Ivan";
    private static final String MIDNAME = "Ivanovich";
    private static final String LASTNAME = "Ivanov";
    private static final String DELADDRESS = "1225 Borregas Ave.";
    private static final String DELCITY = "Boston";
    private static final String BILLADDRESS = "1085 Borregas Ave";
    private static final String BILLCITY = "Albuquerque";
    private static final String BILLSTATE = "New Mexico";
    private static final String BILLZIP = "94089";
    private static final String DELSTATE = "Massachusetts";
    private static final String DELZIP = "91089";
    private static final String DEPORTAIRLINES = "Unified Airlines 363";
    private static final String RETURNAIRLINES = "Blue Skies Airlines 631";
    private static final String WAYFINISHDATEDEPORT = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
    +"tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr" +
            "[5]/td/table/tbody/tr[3]/td/font";
    private static final String DATERETURN = "12/19/2018";
    private static final String WAYPASSENGERSFINALL = "/html/body/div/table/tbody/tr/td[2]/table/tbody"
    +"/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[7]/td/font";
    private static final String WAYFINISHDATERETURN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
    +"tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[5]/td/font" ;
    private static final String WAYBILLETTO = "/html/body/div/"
            +"table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/"
            +"tbody/tr[5]/td/table/tbody/tr[9]/td/p/font[1]";
    private static final String WAYDELIVERIADDRESS = "/html/body/div/table/tbody/tr/td[2]"
    +"/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[11]/td/p/font[1]";
    private static final String WAYFINISHPRICE = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/"
    +"table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[12]/td/table/tbody/tr[2]/td[2]/font/b/font/font/b/font";
    private static final String WAYBUTTONBACKTOHOME = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/"
    +"td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img";


    private static WebDriver driver ;
    private static WebElement selectEl;
    private static Select select;
    private static int priceDepart;
    private static int priceReturn;
    private static int priceTaxi;
    private static int totalPrice;

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
        setText(USERNAME, (String) TESTWORD);
        setText(PASSWORDNAME, (String) TESTWORD);
        setClick(SINGINNAME);
        //step2
        checkTitle("Find a Flight: Mercury Tours:");
        setClick(".//input[@value = 'oneway']");
        cofigureList("passCount",COUNTPASSEGERS);
        cofigureList("fromPort","Paris");
        cofigureList("fromMonth","November");
        cofigureList("fromDay","20");
        cofigureList("toPort","Seattle");
        cofigureList("toMonth","December");
        cofigureList("toDay","19");
        setClick(".//input[@value='Business']");
        cofigureList("airline","Pangea Airlines");
        setClick(".//input[@name = 'findFlights']");
        //step3
        checkTitle("Select a Flight: Mercury Tours");
        checkForTextMaching(WAYPARISTOSEATLE,DEPARTINGWAY);
        checkForTextMaching(WAYDATEDEPORT,DATEDEPORT);
        setClick(".//input[@value = 'Unified Airlines$363$281$11:24']");
        savePriceDepart("281");
        checkForTextMaching(WAYSEATLETOPARIS, RETURNWAY);
        checkForTextMaching(WAYDATERETURN,DATERETURN);
        setClick(".//input[@value = 'Blue Skies Airlines$631$273$14:30']");
        savePriceReturn("273");
        setClick(".//input[@name = 'reserveFlights']");
        //step4
        checkTitle("Book a Flight: Mercury Tours");
        checkForTextMaching(WAYDEPART,DEPARTINGWAY);
        checkForTextMaching(WAYDEPORTDATE,DATEDEPORT);
        checkForTextMaching(WAYFLIGHTDEPORT,DEPORTAIRLINES);
        checkForTextMaching(WAYCLASSDEPORT,CLASSNAME);
        checkForTextMaching(WAYPRICEDEPORT,"281");
        
        checkForTextMaching(WAYRETURN,RETURNWAY);
        checkForTextMaching(WAYRETURNDATE,DATERETURN);
        checkForTextMaching(WAYFLICHTRETURN,RETURNAIRLINES);
        checkForTextMaching(WAYCLASSRETURN,CLASSNAME);
        checkForTextMaching(WAYPRICERETURN,"273");
        checkForTextMaching(WAYPASSENGERS,COUNTPASSEGERS);
        checkDate(WAYTAXESPRICE,"91");
        savePriceTaxi("91");
        checkTotalPrice(Integer.parseInt(COUNTPASSEGERS),priceTaxi);
        setText("passFirst0",LASTNAME);
        setText("passLast0",FIRSTNAME);
        cofigureList("pass.0.meal","Hindu");
        setText("passFirst1","Ivanova");
        setText("passLast1","Irina");
        cofigureList("pass.1.meal","Bland");

        cofigureList("creditCard","Visa");
        setText("creditnumber","5479540454132487");
        cofigureList("cc_exp_dt_mn","05");
        cofigureList("cc_exp_dt_yr","2009");
        setText("cc_frst_name",FIRSTNAME);
        setText("cc_mid_name",MIDNAME);
        setText("cc_last_name",LASTNAME);

        setText("billAddress1",BILLADDRESS);
        setText("billCity",BILLCITY);
        setText("billState",BILLSTATE);
        setText("billZip",BILLZIP);
        cofigureList("billCountry","UNITED STATES");

        setClick(SAMECLICLWAY);
        setText("delAddress1",DELADDRESS);
        setText("delCity",DELCITY);
        setText("delState",DELSTATE);
        setText("delZip",DELZIP);
        cofigureList("delCountry","UNITED STATES");
        setClick(".//input[@name = 'buyFlights']");
        //step5
        checkTitle("Flight Confirmation: Mercury Tours");
        checkDate(WAYFINISHDATEDEPORT,DEPARTINGWAY);
        checkDate(WAYFINISHDATEDEPORT,DATEDEPORT);
        checkDate(WAYFINISHDATEDEPORT,DEPORTAIRLINES);
        checkDate(WAYFINISHDATERETURN,RETURNWAY);
        checkDate(WAYFINISHDATERETURN,DATERETURN);
        checkDate(WAYFINISHDATERETURN,RETURNAIRLINES);
        checkDate(WAYPASSENGERSFINALL,COUNTPASSEGERS);
        checkDate(WAYBILLETTO,FIRSTNAME+" "+MIDNAME+" "+LASTNAME);
        checkDate(WAYBILLETTO,BILLADDRESS);
        checkDate(WAYBILLETTO,BILLCITY);
        checkDate(WAYBILLETTO,BILLSTATE);
        checkDate(WAYBILLETTO,BILLZIP);
        checkDate(WAYDELIVERIADDRESS,DELADDRESS);
        checkDate(WAYDELIVERIADDRESS,DELCITY);
        checkDate(WAYDELIVERIADDRESS,DELSTATE);
        checkDate(WAYDELIVERIADDRESS,DELZIP);
        checkFinishPrice(totalPrice);
        setClick(WAYBUTTONBACKTOHOME);
    }

    private static void checkFinishPrice(int checkPrice) {
        Assert.assertTrue(String.valueOf(checkPrice).matches(driver.findElement(By.xpath(WAYFINISHPRICE))
                .getText().replace("$","")
                .replace(" ","").replace("USD","")));;

    }

    private static void checkDate(String way, String date) {
     Assert.assertTrue(driver.findElement(By.xpath(way)).getText().contains(date));
    }

    private static void checkTotalPrice(int countPerson, int priceTaxi) {
        int testPrice = countPerson*(priceReturn+priceDepart)+priceTaxi;
        totalPrice = testPrice;
        String realCost = driver.findElement(By.xpath(WAYCOST)).getText().replace("$","");
        Assert.assertTrue(realCost.matches(String.valueOf(testPrice)));
    }

    private static void savePriceTaxi(String size) {
        priceTaxi = Integer.parseInt(size);
    }

    private static void savePriceReturn( String size) {
        priceReturn = Integer.parseInt(size);
    }

    private static void savePriceDepart( String size) {
        priceDepart = Integer.parseInt(size);
    }

    private static int savePrice(int price, String size) {
        price = Integer.parseInt(size);
        return price;
    }

    private static void checkForTextMaching(String elementWay, String text) {
        Assert.assertTrue(driver.findElement(By.xpath(elementWay)).getText().matches(text));;
    }
    private static void cofigureList(String nameList, String nameChoise) {
        selectEl = driver.findElement(By.name(nameList));
        select = new Select(selectEl);
        select.selectByVisibleText(nameChoise);
    }
    private static void setClick(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    private static void checkTitle(String title) {
       if(driver.getTitle().equals(title)) {
       }else {
           System.out.println("Step to:"+" "+title+" - error");
           end();
       }
    }
    private static void setText(String name, String text) {
        WebElement textEl = driver.findElement(By.name(name));
        textEl.clear();
        textEl.sendKeys(text);
    }
    private static void end(){
        driver.quit();
    }
}