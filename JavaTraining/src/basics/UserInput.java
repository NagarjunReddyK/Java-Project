package basics;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value: ");
		String name=input.nextLine();
		System.out.println("You entered: "+name);
		input.close();
	}

}
