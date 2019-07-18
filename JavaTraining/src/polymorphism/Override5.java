package polymorphism;

public class Override5 extends  Overridden5{
	protected void resolve(){  //Line-3
		
	}
	protected void rotate(){  //Line-4
		
	}

}

class Overridden5{
	protected void resolve(){ //Line1
		
	}
	void rotate(){ //Line2
		
	}
}

/*
which two modifications, made independently, enable the code to compile?
A. Make the method at Line-1 as public
B. Make the method at Line-2 as public
C. Make the method at Line-3 as public 
D. Make the method at Line-3 as protected 
E. Make the method at Line-4 as public */