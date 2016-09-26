package controlflow;

public class NestedIf {

	public static void main(String args[]) {
	      int x = 30;
	      int y = 10;

	      if( x == 30 ) {
	    	  
	         if( y == 10 ) {
	            System.out.print("X = 30 and Y = 10");
	         }
	         else
	         {
	        	 System.out.print("case failed.");
	         }
	      }
	   }
}

