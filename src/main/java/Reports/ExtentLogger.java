package Reports;

public class ExtentLogger {

    public static void testPass(String logMessage){
        ExtentManager.getExtent().pass(logMessage);
    }
    public static void testFail(String logMessage){
        ExtentManager.getExtent().fail(logMessage);
    }
    public static void testSkip(String logMessage){
        ExtentManager.getExtent().skip(logMessage);
    }
}
