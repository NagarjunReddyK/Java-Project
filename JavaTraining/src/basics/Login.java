package basics;

public class Login {
	String username, password, btnSubmit;
	Login(){
		username="username locator";
		password="password locator";
		btnSubmit="submit locator";
	}
	void display(){
		System.out.println(username+"--"+password+"--"+btnSubmit);
	}
	public static void main(String[] args){
	Login l=new Login();
	l.display();
	}

}
