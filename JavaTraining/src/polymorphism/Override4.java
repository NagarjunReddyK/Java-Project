package polymorphism;

//The access level cannot be more restrictive than the overridden method's access level.
// i.e., we can't reduce the scope but increase the scope
public class Override4 extends Overridden4{
	
	//decreasing the scope of login method protected void login(){
	public void login(){ // Exception: protected/default/private: Cannot reduce the visibility of the inherited method from Overridden4
		System.out.println("login method from Override4 class");
	}
	
	//increasing the scope of click method
	public void click(){
		System.out.println("click method from Override4 class");
	}
	private void getText(){
		System.out.println("click method from getText class");
	}
	
	public static void main(String[] args) {
		
	}

}


class Overridden4{
	public void login(){
		System.out.println("login method from Overridden4 class");
	}
	protected void click(){
		System.out.println("click method from Overridden4 class");
	}
	
	private void getText(){
		System.out.println("click method from getText class");
	}
	
}