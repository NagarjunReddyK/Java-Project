package basics;

import java.util.Scanner;

public class Conditional {
	public static void main(String[] args){
		
		// while loop
		/*int value=0;
		while(value<10){
			System.out.println(value);
			value+=1;
		}*/
		
		// for loop
		/*for(int i=1;i<=10;i++)
			System.out.println(i);*/
		
		// Using loops with break
		/*int loop=0;
		while(true){
			System.out.println("Looping: "+loop);
			if(loop==3)
				break;
			loop++;
			System.out.println("Running...");
		}*/
		
		// do.. while
		/*Scanner input=new Scanner(System.in);
		int value;
		do{
			System.out.println("Enter a Number:");
			value=input.nextInt();
		}
		while(value!=5);
		input.close();
		System.out.println("Got 5!!!");*/
		
		// switch
		Scanner input=new Scanner(System.in);
		System.out.println("Enter text:");
		String text=input.nextLine();
		input.close();
		switch(text){
		case "start":
			System.out.println("Machine Started!");
			break;
		case "stop":
			System.out.println("Machine Stopped!");
			break;
		default:
			System.out.println("Command Not Recognized by the System.");
		}
		
		
	}

}
