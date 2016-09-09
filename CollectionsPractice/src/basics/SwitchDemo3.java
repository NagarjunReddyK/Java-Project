package basics;

//Internal conversion of char to integer  (unicode values a=97, A=65)
public class SwitchDemo3 {

	public static void main(String[] args) {
		int a=65;
		switch(a){
		case 66:
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
