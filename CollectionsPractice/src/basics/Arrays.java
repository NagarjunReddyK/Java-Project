package basics;

public class Arrays {
	public static void main(String[] args){
		
		// 1-D array
		/*int[] values=new int[3];
		values[0]=10;
		values[1]=20;
		values[2]=30;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		for(int i=0;i<values.length;i++)
			System.out.println(values[i]);
		
		String[] users={"NagarjunReddy K","Prasad D","Chaitanya K","Mohan U","Srihari S"};
		for(int i=0;i<users.length;i++)
			System.out.println(users[i]);
		
		for(String user:users)
			System.out.print(user+", ");*/
		
		
		// 2-D array
		/*int[][] grid={{1,2,3,4},{4,5,6},{10,20,30,40}};
		for(int row=0;row<grid.length;row++){
			for(int col=0;col<grid[row].length;col++){
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
		}*/
		
		for(int i=1;i<=6;i++){
			for(int j=i;j<=6;j++){
				System.out.print("*\t");
			}
			System.out.println();
		}
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*\t");
			}
			System.out.println();
		}
		
	}

}
