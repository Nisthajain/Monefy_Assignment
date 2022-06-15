package com.runner;                                                                                                         
                                                                                                                            
import java.io.IOException;                                                                                                 
                                                                                                                            
import org.junit.BeforeClass;                                                                                               
import org.junit.runner.RunWith;                                                                                            
import org.openqa.selenium.WebDriver;                                                                                       
import com.Reports.Reports;                                                                                                 
import com.aventstack.extentreports.ExtentReports;                                                                          
import com.aventstack.extentreports.ExtentTest;                                                                             
import com.customException.FolderNotCreated;                                                                                
                                                                                                                            
import io.cucumber.junit.Cucumber;                                                                                          
import io.cucumber.junit.CucumberOptions;                                                                                   
                                                                                                                            
                                                                                                                            
                                                                                                                            
                                                                                                                            
@RunWith(Cucumber.class)                                                                                                    
@CucumberOptions(                                                                                                           
		features = {"./src/test/resources/testSteps/ExpenseIncome.feature"},                                                
		glue = {"testSteps"},                                                                                               
		monochrome = true,                                                                                                  
		dryRun = false,                                                                                                     
		plugin = {"pretty","json:Reports/cucumber-reports/Cucumber.json", "html:Reports/cucumber-reports.html",             
				"rerun:target/failedTestCases.txt"}                                                                         
		)                                                                                                                   
                                                                                                                            
public class TestRunner  {                                                                                                  
	                                                                                                           	            
	static Reports reports = new Reports();                                                                                 
	static ExtentReports createReport;                                                                                      
	ExtentTest createTest;                                                                                                  
	                                                                                                           	            
	@BeforeClass                                                                                                            
	public static void createReport() throws FolderNotCreated, IOException {                                                
		createReport = reports.createReport("Run_");                                                                        
	}                                                                                                                       
	                                                                                                           	            
	public ExtentTest createTest(String testName, String description, WebDriver driver) {                                   
		createTest = reports.createTest(testName, description, driver);                                                     
		return createTest;                                                                                                  
	}                                                                                                                       
	                                                                                                           	            
	public ExtentTest getTest() {                                                                                           
		return createTest;                                                                                                  
	}                                                                                                                       
	                                                                                                           	            
	public void closeReports() {                                                                                            
		reports.closeReport();                                                                                              
	}                                                                                                                       
	                                                                                                           	            
	/*                                                                                                                      
	 * @Override                                                                                                            
	 *                                                                                                                      
	 * @DataProvider(parallel = false) public Object[][] scenarios() { //return                                             
	 * super.scenarios(); }                                                                                                 
	 */                                                                                                                     
}                                                                                                                           
                                                                                                                            