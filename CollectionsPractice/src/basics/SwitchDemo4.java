package basics;

//Internal conversion of integer to char
public class SwitchDemo4 {

	public static void main(String[] args) {
		char ch='d';
		switch(ch){
		case 100:
			System.out.println("10");
			break;
		case 'A':
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		default: 
			System.out.println("default");
			break;
		}

	}

}
