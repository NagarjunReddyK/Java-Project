package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.By;
 
public class RepositoryParser {
 
	private FileInputStream stream;
	private String repositoryFile;
	private Properties propertyFile = new Properties();
 
	public RepositoryParser(String fileName) throws IOException
	{
		repositoryFile = fileName;
		stream = new FileInputStream(repositoryFile);
		propertyFile.load(stream);
	}
 
	public By getobjectLocator(String locatorName)
	{
		String locatorProperty = propertyFile.getProperty(locatorName);
		//System.out.println(locatorProperty.toString());
		String locatorType = locatorProperty.split(":")[0];
		String locatorValue = locatorProperty.split(":")[1];
 
		By locator = null;
		switch(locatorType)
		{
		case "Id":
			locator = By.id(locatorValue);
			break;
		case "Name":
			locator = By.name(locatorValue);
			break;
		case "CssSelector":
			locator = By.cssSelector(locatorValue);
			break;
		case "LinkText":
			locator = By.linkText(locatorValue);
			break;
		case "PartialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;
		case "TagName":
			locator = By.tagName(locatorValue);
			break;
		case "Xpath":
			locator = By.xpath(locatorValue);
			break;
		}
		return locator;
	}
}