package collectionstest;

import java.io.IOException;

import org.openqa.selenium.By;

import base.RepositoryParser;
import base.Webpage;

public class PageActions {
	static RepositoryParser parser;
	static By username=null;
	static By password=null;
	static By btnLogin=null;
	public PageActions() throws IOException{
		 parser=new RepositoryParser("D:\\GitRepository\\CollectionsPractice\\objectrepository.properties");
		 username=parser.getobjectLocator("txtEmail");
		 password=parser.getobjectLocator("txtPassword");
		 btnLogin=parser.getobjectLocator("btnSignin");
	}
	public void login(String email, String pwd){
/*		parser=new RepositoryParser("D:\\GitRepository\\CollectionsPractice\\objectrepository.properties");
		By username=parser.getobjectLocator("txtEmail");
		By password=parser.getobjectLocator("txtPassword");
		By btnLogin=parser.getobjectLocator("btnSignin");*/
		Webpage.enterText(username, email);
		Webpage.enterText(password, pwd);
		Webpage.click(btnLogin);
	}	

}
