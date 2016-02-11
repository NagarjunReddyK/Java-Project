import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;


public class Login {
	ReadXMLFile xml=null;
	String path="D:/login.xml";
	@BeforeSuite
	public void loadXML() throws ParserConfigurationException, SAXException, IOException{
		xml=new ReadXMLFile(path);
		xml.readXML();
		//System.out.println("Creadentilas are "+xml.userName+", "+xml.password);
	}
	@Test
	public void testLogin(){
		System.out.println("Creadentilas are: "+xml.userName+", "+xml.password);
	}

}
