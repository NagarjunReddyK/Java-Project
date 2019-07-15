package interfaces;

public interface WebPage {
	
	/*Interface:
		--> It is used to achieve multiple inheritance.
		--> All the methods are public and abstract. And all the fields are public, static, and final.
		--> We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.
		--> A class can implement more than one interface.
		--> A class that implements interface must implements all the methods in interface.
		--> An interface can extends another interface or interfaces (more than one interface) .
		--> An interface cannot implement another Interface. It has to extend another interface if needed.
		--> At the time of declaration, interface variable must be initialized. Otherwise, the compiler will throw an error.
		--> The class cannot implement two interfaces in java that have methods with same name but different return type.

		Prior to JDK 8, interface could not define implementation. We can now add default implementation for interface methods. 
		--> With the help of default implementation, we will give a default body for the newly added functions.
		--> Another feature that was added in JDK 8 is that we can now define static methods in interfaces which can be called independently without an object.
		Note: these methods are not inherited.*/
	
	int a=10; //By default, Variables in interface are public static final
	int b=111;
	public abstract void click();  //By default, members in interface are public & abstract
	void sendKeys();
	void getText();
	default void getWebElement() {
		System.out.println("getWebElement method from WebPage interface...");
	}
	static void getWebElements() {
		System.out.println("getWebElements method from WebPage interface...");
	}

}
