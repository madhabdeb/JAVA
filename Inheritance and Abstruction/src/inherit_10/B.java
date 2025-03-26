package inherit_10;


public class B extends A{
	
	int a;
	
	B(){
		a=5;
		System.out.println("second");
	}
	B(int i){	
		super(i);
		
		a=i;
	}
	
}