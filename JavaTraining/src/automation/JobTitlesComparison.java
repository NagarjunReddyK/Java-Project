package automation;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import comparison.ArrayListCompare;


public class JobTitlesComparison {
	static MasterDB master=null;
	static Properties prop=null;
	static ArrayList<String> unmatched;
	public static void main(String[] args) throws Exception {
		try{
			String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();	
			//Maximizing browser window using maximize() method
			driver.manage().window().maximize();
			driver.get("url");
			driver.findElement(By.linkText("Sign Up")).click();
			
			//String str="CEO, President, Owner, Executive Director, CFO, VP Finance, Controller, Director Finance, Other Finance, CIO, COO, CTO, VP IT, Director IT, Other IT, Other";
			
			/*FileInputStream titles = new FileInputStream(System.getProperty("user.dir")+"//objectrepository.properties");
			prop=new Properties();
			prop.load(titles);
			
			String str=prop.getProperty("jobtitles");
			
			ArrayList<String> expectedOptions=new ArrayList<String>(Arrays.asList(str.split("\\s*,\\s*")));
			System.out.println("Expected values from Job Title: "+expectedOptions);*/
			
			//To get the Expected values from DB
				master=new MasterDB();
				ArrayList<String> expectedOptions=master.getJobTitles();
				System.out.println("Expected values of Job Title drop down list: "+expectedOptions);
			
			//Getting Actual Options
			WebElement element=driver.findElement(By.id("ddlJobTitle"));
			Select select=new Select(element);
			List<WebElement> options=select.getOptions();
			ArrayList<String> actualOptions=new ArrayList<String>();
			for(WebElement option:options){
				actualOptions.add(option.getText());
			}
			actualOptions.remove(0);
			System.out.println("Actual values from Job Title: "+actualOptions);
			
			//Comparing both actual & expected options
			unmatched=ArrayListCompare.compareLists(expectedOptions, actualOptions);
			System.out.println("Unmatched values: "+unmatched);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
