package interfaces;

public class ChromeBrowser implements WebPage {


	public void click() {
		System.out.println("click method from ChromeBrowser");
	}


	public void sendKeys() {
		System.out.println("sendKeys method from ChromeBrowser");
	}


	public void getText() {
		System.out.println("getText method from ChromeBrowser");
	}
	
	public void waitForElement(){
		System.out.println("waitForElement method from ChromeBrowser");
	}
	
	public static void main(String[] args) {
		WebPage driver=new ChromeBrowser();
		driver.click();
		driver.sendKeys();
		driver.getText();
		driver.getWebElement();
		WebPage.getWebElements();
		System.out.println(WebPage.a);
		System.out.println(WebPage.b);
		
		ChromeBrowser chr=new ChromeBrowser();
		chr.waitForElement();
		
	}

}
