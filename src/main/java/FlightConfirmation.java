import org.junit.Assert;
import org.openqa.selenium.By;

public class FlightConfirmation extends UniversalMetods {
    private static  String NAMEPAGE = "Flight Confirmation: Mercury Tours";

    public static void start(){
        checkTitle(NAMEPAGE);
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
                .replace(" ","").replace("USD","")));
        System.out.println("Цена :"+checkPrice+" -Проверена");

    }
}
