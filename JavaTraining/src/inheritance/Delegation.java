package inheritance;

public class Delegation {
	public static void main(String[] args) {
		//outside world thinking Statement class doing work but not.
		Statement st=new Statement();
		st.getDetails();
	}
}

class Transaction{
	void getDetails(){
		System.out.println("Transaction class: getDetails method");
	}
}

class Statement{
	Transaction t=new Transaction();
	void getDetails(){
		t.getDetails(); //delegation
	}
}