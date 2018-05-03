public class FindAFlight extends UniversalMetods{
    private static  String WAYCLICKTHREE = ".//input[@name = 'findFlights']";
    private static  String PANGEA = "Pangea Airlines";
    private static  String AIRLINE = "airline";
    private static  String WAYCLICKTWO = ".//input[@value='Business']";
    private static  String DAYRETURN = "19";
    private static  String TODAY = "toDay";
    private static  String DECEMBER = "December";
    private static  String TOMONTH = "toMonth";
    private static  String SEATTLE = "Seattle";
    private static  String TOPORT = "toPort";
    private static  String DAYDEPORT = "20";
    private static  String FROMDAY = "fromDay";
    private static  String NOVEMBER = "November";
    private static  String FROMMONTH = "fromMonth";
    private static  String PARIS = "Paris";
    private static  String FROMPORT = "fromPort";
    private static  String PASSCOUNT = "passCount";
    private static  String WAYCLICKONE = ".//input[@value = 'oneway']";
    private static  String NAMEPAGE = "Find a Flight: Mercury Tours:";

    public static void start(){
        checkTitle(NAMEPAGE);
        setClick(WAYCLICKONE);
        cofigureList(PASSCOUNT,COUNTPASSEGERS);
        cofigureList(FROMPORT,PARIS);
        cofigureList(FROMMONTH,NOVEMBER);
        cofigureList(FROMDAY,DAYDEPORT);
        cofigureList(TOPORT,SEATTLE);
        cofigureList(TOMONTH,DECEMBER);
        cofigureList(TODAY,DAYRETURN);
        setClick(WAYCLICKTWO);
        cofigureList(AIRLINE,PANGEA);
        setClick(WAYCLICKTHREE);
    }

}
