package com.SalesForce.Base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.SalesForce.Utilities.GenerateReports;
import com.SalesForce.Utilities.CommonUtilities;
import com.SalesForce.Base.*;
import com.SalesForce.Pages.Accounts.AccountsPage;
import com.SalesForce.Pages.Accounts.EditAccViewPage;
import com.SalesForce.Pages.Accounts.MergeAccountsPage;
import com.SalesForce.Pages.Accounts.UnsavedReports;
import com.SalesForce.Pages.AllTabs.AllTabs;
import com.SalesForce.Pages.AllTabs.CalenderPage;
import com.SalesForce.Pages.Contacts.Contacts;
import com.SalesForce.Pages.Home.Home;
import com.SalesForce.Pages.Leads.LeadsPage;
import com.SalesForce.Pages.Opportunities.OpportunitiesPage;
import com.SalesForce.Pages.SDFCLogin.SDFCLoginPage;
import com.SalesForce.Pages.UserMenuDropdown.DeveloperConsole;
import com.SalesForce.Pages.UserMenuDropdown.MyProfile;
import com.SalesForce.Pages.UserMenuDropdown.MySetting;
import com.SalesForce.Pages.UserMenuDropdown.UserMenuDropdown_EntryPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	//private static final String[] {browser} = null;
	protected static GenerateReports report=GenerateReports.getInstance();
	protected static WebDriver driver;
	protected static SDFCLoginPage loginPage;
	protected static UserMenuDropdown_EntryPage userPage;
	protected static MyProfile myProfile;
	protected static MySetting mySetting;
	protected static DeveloperConsole devConsole;
	protected static AccountsPage accounts;
	protected static EditAccViewPage editView;
	protected static MergeAccountsPage mergeAcct;
	protected static UnsavedReports accReport;
	protected static OpportunitiesPage opportunitiesPage;
	protected static LeadsPage leads;
	protected static Contacts contacts;
	protected static Home home;
	protected static AllTabs allTabs;
	protected static CalenderPage calender;
//	protected static HomePage homePage;
	@BeforeTest
	public void setUp() {
		System.out.println("Before classs is executing");
		report.startExtentReport();
		System.out.println("extent report document is created");
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	
	public void initialSetUp(String browserName,Method method){
		report.startSingleTestReport(method.getName());
		System.out.println("Before method is executing");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(CommonUtilities.getApplicationProperty("url"));
		loginPage=new SDFCLoginPage(driver);
		userPage=new UserMenuDropdown_EntryPage(driver);
		myProfile=new MyProfile(driver);
		mySetting=new MySetting(driver);
		devConsole=new DeveloperConsole(driver);
		accounts=new AccountsPage(driver);
		editView=new EditAccViewPage(driver);
		mergeAcct=new MergeAccountsPage(driver);
		accReport=new UnsavedReports(driver);
		opportunitiesPage=new OpportunitiesPage(driver);
		leads=new LeadsPage(driver);
		contacts=new Contacts(driver);
		home=new Home(driver);
		allTabs=new AllTabs(driver);
		calender=new CalenderPage(driver);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {
			report.logTestpassed();
		} else if(result.getStatus()==ITestResult.FAILURE) {
			report.logTestFailed();
			String path=BasePage.takeScreenShot();
			try {
				report.logger.addScreenCaptureFromPath(path);
				//report.logger.addScreenCaptureFromPath(path, path)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		//closeAllDriver();
		driver.quit();
	}
	@AfterTest
	public void endUp()
	{
		report.endTestReport();
	}
	

}
