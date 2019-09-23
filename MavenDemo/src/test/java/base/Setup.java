package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Setup {
	public static Properties login = null;
	public static Properties db = null;
	public static ExcelReader xlLogin = null;
	public static ExcelReader xlVendors = null;
	public static ExtentReports report;
	public static Logger log;
	public static ExtentTest logger;

	public static void initialize() throws IOException {
		try {
			// To load Login.properties file
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//configuration//Login.properties");
			login = new Properties();
			login.load(fis);
			System.out.println("Login.properties file has been successfully loaded.");

			// To load Database.properties file
			FileInputStream db_prop = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//configuration//Database.properties");
			db = new Properties();
			db.load(db_prop);
			System.out.println("Database.properties file has been successfully loaded.");

			// To initialize excel files
			xlLogin = new ExcelReader(System.getProperty("user.dir") + "//src//test//java//testdata//LoginExcel.xlsx");

			xlVendors = new ExcelReader(System.getProperty("user.dir") + "//src//test//java//testdata//Vendors.xlsx");

			// Declaring LOG4J for Logging.
			log = Logger.getLogger(Setup.class.getName());
			DOMConfigurator.configure("log4j.xml");

			// To configure ExtentReport html file
			report = new ExtentReports(System.getProperty("user.dir") + "//Reports//Test_Report_"+LocalTime.now().getNano()+".html");
			Map<String, String> sysInfo = new HashMap<String, String>();
			sysInfo.put("Environment", "QA");
			sysInfo.put("Selenium Version", "2.53.1");
			sysInfo.put("Browser", "Chrome");
			report.addSystemInfo(sysInfo);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
