public class SelectAFlight extends UniversalMetods{
    private static  String WAYCLICKTHREE = ".//input[@name = 'reserveFlights']";
    private static  String NAMEPAGE = "Select a Flight: Mercury Tours";
    private static  String WAYCLICKONE = ".//input[@value = 'Unified Airlines$363$281$11:24']";
    private static  String WAYCLICKTWO = ".//input[@value = 'Blue Skies Airlines$631$273$14:30']";

    public static void start(){
        checkTitle(NAMEPAGE);
        checkForTextMaching(WAYPARISTOSEATLE,DEPARTINGWAY);
        checkForTextMaching(WAYDATEDEPORT,DATEDEPORT);
        setClick(WAYCLICKONE);
        savePriceDepart(PRICEDEPORT);
        checkForTextMaching(WAYSEATLETOPARIS, RETURNWAY);
        checkForTextMaching(WAYDATERETURN,DATERETURN);
        setClick(WAYCLICKTWO);
        savePriceReturn(PRICERETURN);
        setClick(WAYCLICKTHREE);
    }
    private static void savePriceReturn( String size) {
        priceReturn = Integer.parseInt(size);
    }

    private static void savePriceDepart( String size) {
        priceDepart = Integer.parseInt(size);
    }
}
