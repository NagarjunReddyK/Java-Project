package collectionstest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabeticalOrderDemo {
	static String input;
	static int count;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a word: ");
		input=br.readLine();
		count=input.length();
		AlphabeticalOrder.alphabetical(input,count);
	}
}
