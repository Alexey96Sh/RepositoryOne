public class StartPage extends UniversalMetods{
        public static  String USERNAME = "userName";
        public static  String TESTWORD = "test1";
        public static  String PASSWORDNAME = "password";
        public static  String SINGINNAME = ".//input[@name = 'login']";
    public static void start(){
    setText(USERNAME, (String) TESTWORD);
    setText(PASSWORDNAME, (String) TESTWORD);
    setClick(SINGINNAME);
}

}
