package collectionstest;

public class AlphabeticalOrder {
	static String input;
	static int count;

	public static void main(String[] args) {
		input="Nagarjun";
		count=input.length();
		alphabetical(input,count);
	}
	public static void alphabetical(String input,int count){
		char b[]=new char[count];
		for(int i=0;i<count;i++)
			b[i]=input.charAt(i);
		char temp;
		for(int j=0;j<count-1;j++){
			for(int k=0;k<count-1-j;k++){
				if(b[k]>b[k+1]){
					temp=b[k];
					b[k]=b[k+1];
					b[k+1]=temp;
				}
			}
		}
		System.out.println("Original Word: "+input);
		System.out.print("Sorted Word: ");
		for(int m=0;m<count;m++)
			System.out.print(b[m]);
	}

}
