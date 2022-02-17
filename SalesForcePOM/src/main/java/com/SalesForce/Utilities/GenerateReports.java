package com.SalesForce.Utilities;
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.markuputils.ExtentColor;
	import com.aventstack.extentreports.markuputils.MarkupHelper;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
	import com.aventstack.extentreports.reporter.configuration.ChartLocation;
	import com.aventstack.extentreports.reporter.configuration.Theme;
	import static com.SalesForce.Utilities.Constants.GENERATE_REPORT_PATH;
	
	
	public class GenerateReports {
		
		ExtentHtmlReporter reporter;

		ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		public static ExtentTest logger;
		private static GenerateReports ob;
		private GenerateReports() {
			// TODO Auto-generated constructor stub
		}
		public static GenerateReports getInstance() {
			if(ob==null) {
				ob=new GenerateReports();
			}
			return ob;
		}

		static String testcaseName = null;

		public void startExtentReport() {

			htmlReporter = new ExtentHtmlReporter(GENERATE_REPORT_PATH);
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("Host Name", "Salesforce");
			extent.setSystemInfo("Environment", "Automation Testing");
			extent.setSystemInfo("User Name", "Veni");

			htmlReporter.config().setDocumentTitle("Test Execution Report");
			htmlReporter.config().setReportName("SalesForce regression tests");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTheme(Theme.STANDARD);
		}

		public void startSingleTestReport(String testName) {
			testcaseName = testName;
			logger = extent.createTest(testcaseName);
		}

		public void logTestInfo(String message) {

			logger.log(Status.INFO, message);
		}

		public void logTestpassed() {
			logger.log(Status.PASS, MarkupHelper.createLabel(testcaseName + "is passTest", ExtentColor.GREEN));
		}

		public void logTestFailed() {
			logger.log(Status.FAIL, MarkupHelper.createLabel(testcaseName + "is not passTest", ExtentColor.RED));
		}

		public void endTestReport() {
			extent.flush();
		}

	}


