import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ResursConstant {

    public static WebDriver driver ;
    public static WebElement selectEl;
    public static Select select;
    public static  String COUNTPASSEGERS = "2";
    public static int priceDepart;
    public static int priceReturn;
    public static int priceTaxi;
    public static int totalPrice;
    public static  String PRICEDEPORT = "281";
    public static  String PRICERETURN = "273";
    public static  String CLASSNAME = "Business";
    public static  String DEPARTINGWAY = "Paris to Seattle";
    public static  String RETURNWAY = "Seattle to Paris";
    public static  String DATEDEPORT = "11/20/2018";
    public static  String FIRSTNAME = "Ivan";
    public static  String MIDNAME = "Ivanovich";
    public static  String LASTNAME = "Ivanov";
    public static  String DELADDRESS = "1225 Borregas Ave.";
    public static  String DELCITY = "Boston";
    public static  String BILLADDRESS = "1085 Borregas Ave";
    public static  String BILLCITY = "Albuquerque";
    public static  String BILLSTATE = "New Mexico";
    public static  String BILLZIP = "94089";
    public static  String DELSTATE = "Massachusetts";
    public static  String DELZIP = "91089";
    public static  String DEPORTAIRLINES = "Unified Airlines 363";
    public static  String RETURNAIRLINES = "Blue Skies Airlines 631";
    public static  String WAYPARISTOSEATLE = "/html/body/div/table/tbody/"
            + "tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/"
            +"td[2]/table/tbody/tr[5]/td/form/table[1]"
            +"/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font";
    public static  String WAYDATEDEPORT = "/html/body/div/table/tbody/tr/"
            +"td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/"
            +"td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font";
    public static  String WAYSEATLETOPARIS = "/html/body/div/table/tbody/tr/"
            +"td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
            +"table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font";
    public static  String WAYDATERETURN = "/html/body/div/table/tbody/tr/"
            +"td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
            +"table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font";
    public static  String WAYDEPART = "/html/body/div/table/tbody/tr/td[2]/"
            +"table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/"
            +"tr[2]/td/table/tbody/tr[1]/td[1]/b/font";
    public static  String WAYDEPORTDATE = "/html/body/div/table/tbody/tr/td[2]/"
            +"table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/"
            +"tr[2]/td/table/tbody/tr[1]/td[2]/b/font";
    public static  String WAYFLIGHTDEPORT = "/html/body/div/table/tbody/tr/td[2]/table/"
            +"tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td"
            +"/table/tbody/tr[3]/td[1]/font/b";
    public static  String WAYCLASSDEPORT = "/html/body/div/table/tbody/tr/td[2]/table/"
            +"tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table"
            +"/tbody/tr[3]/td[2]/font";
    public static  String WAYPRICEDEPORT = "/html/body/div/table/tbody/tr/td[2]/table/"
            +"tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table"
            +"/tbody/tr[3]/td[3]/font";
    public static  String WAYRETURN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
            +"tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody"
            +"/tr[4]/td[1]/b/font";
    public static  String WAYRETURNDATE = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
            +"tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr"
            +"[4]/td[2]/b/font";
    public static  String WAYFLICHTRETURN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
            +"tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]"
            +"/td[1]/font/font/font[1]/b";
    public static  String WAYCLASSRETURN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
            +"tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/font";
    public static  String WAYPRICERETURN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table"
            +"/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td[3]/font";
    public static  String WAYPASSENGERS = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
            +"tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[7]/td[2]/font";
    public static  String WAYTAXESPRICE = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]"
            +"/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[8]/td[2]/font";
    public static  String WAYCOST = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/"
            +"tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[9]/td[2]/font/b";
    public static  String SAMECLICLWAY = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/"
            +"td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input";
    public static  String WAYFINISHDATEDEPORT = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
            +"tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr" +
            "[5]/td/table/tbody/tr[3]/td/font";
    public static String DATERETURN = "12/19/2018";
    public static String WAYPASSENGERSFINALL = "/html/body/div/table/tbody/tr/td[2]/table/tbody"
            +"/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[7]/td/font";
    public static String WAYFINISHDATERETURN = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
            +"tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[5]/td/font" ;
    public static String WAYBILLETTO = "/html/body/div/"
            +"table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/"
            +"tbody/tr[5]/td/table/tbody/tr[9]/td/p/font[1]";
    public static String WAYDELIVERIADDRESS = "/html/body/div/table/tbody/tr/td[2]"
            +"/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[11]/td/p/font[1]";
    public static String WAYFINISHPRICE = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/"
            +"table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[12]/td/table/tbody/tr[2]/td[2]/font/b/font/font/b/font";
    public static String WAYBUTTONBACKTOHOME = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/"
            +"td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img";

}
