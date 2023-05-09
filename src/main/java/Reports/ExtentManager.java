package Reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

    public static ExtentTest eTest;
    public static ExtentTest getExtent(){

    return eTest;
    }
    public static void setExtent(ExtentTest eT){
        eT = eTest;
    }

}
