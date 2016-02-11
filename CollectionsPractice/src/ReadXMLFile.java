import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class ReadXMLFile {
	String path;
	String userName,password;
	public ReadXMLFile(String path) {
		this.path=path;
	}
	public void readXML() throws ParserConfigurationException, SAXException, IOException{
		
			File xmlFile=new File(path);
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document doc=db.parse(xmlFile);
			doc.getDocumentElement().normalize();
			//System.out.println("Root Element :"+doc.getDocumentElement().getNodeName());
			NodeList nList=doc.getElementsByTagName("login");
			//System.out.println(nList.getLength());
			for(int i=0;i<nList.getLength();i++){
				Node nNode=(Node) nList.item(i);
				//System.out.println("\nCurrent Element : "+nNode.getNodeName());
				if(nNode.getNodeType()==Node.ELEMENT_NODE){
					Element ele=(Element) nNode;
					//System.out.println("Login id: "+ele.getAttribute("id"));
					userName=ele.getElementsByTagName("username").item(0).getTextContent();
					password=ele.getElementsByTagName("password").item(0).getTextContent();
				}
			}
	}

}
