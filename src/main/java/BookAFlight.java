import org.junit.Assert;
import org.openqa.selenium.By;

public class BookAFlight extends UniversalMetods {
    private static  String NAMEDELCOUNTRY = "delCountry";
    private static  String NAMEDELZIP = "delZip";
    private static  String NAMEBILLCOUNTRY = "billCountry";
    private static  String UNITETSATES = "UNITED STATES";
    private static  String NAMEDELADD = "delAddress1";
    private static  String NAMEDELCITY = "delCity";
    private static  String NAMEDELSTATE = "delState";
    private static  String NAMEBILLZIP = "billZip";
    private static  String NAMEBILLCITY = "billCity";
    private static  String NAMEBILLSTATE = "billState";
    private static  String NAMEFIRST = "cc_frst_name";
    private static  String NAMEMID = "cc_mid_name";
    private static  String NAMELAST = "cc_last_name";
    private static  String NAMEBILLADD = "billAddress1";
    private static  String DAY = "05";
    private static  String YEAR = "2009";
    private static  String NAMEDAY = "cc_exp_dt_mn";
    private static  String NAMEYEAR = "cc_exp_dt_yr";
    private static  String NUMBERCREDIT = "creditnumber";
    private static  String NUMBERCARD = "5479540454132487";
    private static  String VISA = "Visa";
    private static  String CREDITCARD = "creditCard";
    private static  String PASSMEAL = "pass.1.meal";
    private static  String BLAND = "Bland";
    private static  String PASSLAST = "passLast1";
    private static  String NAMEPASS = "pass.0.meal";
    private static  String HINDU = "Hindu";
    private static  String PASSFIRST = "passFirst1";
    private static  String IVANOVA = "Ivanova";
    private static  String IRINA = "Irina";
    private static  String WAYCLICK = ".//input[@name = 'buyFlights']";
    private static  String PRICETAXI = "91";
    private static  String NAMEPASSFIRST = "passFirst0";
    private static  String NAMEPASSLAST = "passLast0";
    private static String NAMETITLE = "Book a Flight: Mercury Tours";

    public static void start(){

        checkTitle(NAMETITLE);
        checkForTextMaching(WAYDEPART,DEPARTINGWAY);
        checkForTextMaching(WAYDEPORTDATE,DATEDEPORT);
        checkForTextMaching(WAYFLIGHTDEPORT,DEPORTAIRLINES);
        checkForTextMaching(WAYCLASSDEPORT,CLASSNAME);
        checkForTextMaching(WAYPRICEDEPORT,PRICEDEPORT);
        checkForTextMaching(WAYRETURN,RETURNWAY);
        checkForTextMaching(WAYRETURNDATE,DATERETURN);
        checkForTextMaching(WAYFLICHTRETURN,RETURNAIRLINES);
        checkForTextMaching(WAYCLASSRETURN,CLASSNAME);
        checkForTextMaching(WAYPRICERETURN,PRICERETURN);
        checkForTextMaching(WAYPASSENGERS,COUNTPASSEGERS);
        checkDate(WAYTAXESPRICE,PRICETAXI);
        savePriceTaxi(PRICETAXI);
        checkTotalPrice(Integer.parseInt(COUNTPASSEGERS),priceTaxi);
        setText(NAMEPASSFIRST,LASTNAME);
        setText(NAMEPASSLAST,FIRSTNAME);
        cofigureList(NAMEPASS,HINDU);
        setText(PASSFIRST,IVANOVA);
        setText(PASSLAST,IRINA);
        cofigureList(PASSMEAL,BLAND);
        cofigureList(CREDITCARD,VISA);
        setText(NUMBERCREDIT,NUMBERCARD);
        cofigureList(NAMEDAY,DAY);
        cofigureList(NAMEYEAR,YEAR);
        setText(NAMEFIRST,FIRSTNAME);
        setText(NAMEMID,MIDNAME);
        setText(NAMELAST,LASTNAME);
        setText(NAMEBILLADD,BILLADDRESS);
        setText(NAMEBILLCITY,BILLCITY);
        setText(NAMEBILLSTATE,BILLSTATE);
        setText(NAMEBILLZIP,BILLZIP);
        cofigureList(NAMEBILLCOUNTRY,UNITETSATES);
        setClick(SAMECLICLWAY);
        setText(NAMEDELADD,DELADDRESS);
        setText(NAMEDELCITY,DELCITY);
        setText(NAMEDELSTATE,DELSTATE);
        setText(NAMEDELZIP,DELZIP);
        cofigureList(NAMEDELCOUNTRY,UNITETSATES);
        setClick(WAYCLICK);
    }
    private static void checkTotalPrice(int countPerson, int priceTaxi) {
        int testPrice = countPerson*(priceReturn+priceDepart)+priceTaxi;
        totalPrice = testPrice;
        String realCost = driver.findElement(By.xpath(WAYCOST)).getText().replace("$","");
        Assert.assertTrue(realCost.matches(String.valueOf(testPrice)));
        System.out.println("Цена :"+testPrice+" -Проверена");
    }
    private static void savePriceTaxi(String size) {
        priceTaxi = Integer.parseInt(size);
    }
}
