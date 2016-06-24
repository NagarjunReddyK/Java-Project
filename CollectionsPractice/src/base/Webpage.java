package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import collectionstest.Login;

public class Webpage {
	public static WebDriver driver;
	public static WebDriver getDriver(){
		return Login.driver;
	}
	public static void click(By element){
		getDriver().findElement(element).click();
	}
	public static void enterText(By element, String value){
		getDriver().findElement(element).sendKeys(value);
	}
}
