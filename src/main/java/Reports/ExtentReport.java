package Reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExtentReport {
    public static ExtentReports extent;
    public static void initReport(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
        extent.attachReporter(spark);
        spark.config().setReportName("NopCommerce Report");
        spark.config().setDocumentTitle("Document 1");
        spark.config().setTheme(Theme.DARK);
    }
    public static void quitReport() throws IOException {
        extent.flush();
        Desktop.getDesktop().browse(new File("index.html").toURI());
    }

    public static void createTest(String testCaseName) {
        ExtentManager.setExtent(extent.createTest(testCaseName));
    }

}
