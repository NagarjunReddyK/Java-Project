package basics;

public class SwitchDemo5 {
	public static void getElement(String type){
		switch(type){
		case "Id":
			System.out.println("driver.findElement(By.id(\"id here\"))");
			break;
		case "Name":
			System.out.println("driver.findElement(By.name(\"name here\"))");
			break;
		case "Xpath":
			System.out.println("driver.findElement(By.xpath(\"xpath here\"))");
			break;
		case "link":
			System.out.println("driver.findElement(By.linkText(\"link text here\"))");
			break;
		}
	}

	public static void main(String[] args) {
		getElement("Xpath");

	}

}
