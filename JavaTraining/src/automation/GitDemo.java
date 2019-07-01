package automation;

public class GitDemo {
	public String getName(int id){
		
		switch(id){
		case 1:
			System.out.println("Case 1:");
			return "Case1";
		case 2:
			System.out.println("Case 2:");
			return "Case2";
		case 3:
			System.out.println("Case 3:");
			return "Case3";
		default:
			System.out.println("default case");
			return "default";
		}
	}
	
	public static void main(String[] args) {
		GitDemo obj=new GitDemo();
		String retvalue=obj.getName(0);
		System.out.println(retvalue);
		
	}

}
