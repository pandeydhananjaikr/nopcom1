package Listeners;

import Reports.ExtentLogger;
import Reports.ExtentReport;
import org.testng.*;

import java.io.IOException;

public class ListenerClass implements ITestListener, ISuiteListener {


    public void onStart(ISuite suite) {
        ExtentReport.initReport();
    }

    public void onFinish(ISuite suite) {
        try {
            ExtentReport.quitReport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        ExtentLogger.testPass(result.getMethod().getMethodName()+"is Passed");
    }

    public void onTestFailure(ITestResult result) {
        ExtentLogger.testFail(result.getMethod().getMethodName()+"is Failed");
    }

    public void onTestSkipped(ITestResult result) {
        ExtentLogger.testSkip(result.getMethod().getMethodName()+"is Skipped");
    }


}
