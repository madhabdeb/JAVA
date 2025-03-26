package inherit_10;

public class C extends B {
	
int b;
	
	C(){
		b=5;
		System.out.println("three");
	}
	C(int i){	
		super(i);
		
		b=i;
	}
	
	void sum(){
		System.out.println("hira");
		System.out.println(a+" "+b+" "+c);
	}

}
