package joverloading;

public class test {
	int a;
	int b;
	
	void sum(int i){
		System.out.println(a+b);
	}
	
	void sum(float a){
		System.out.println(a);
	}
	void sum(){
	System.out.println("ma");	
	}
	
	public int sum(int i,int j){
		return i+j;
	}
	
//////////  ERROR BCOZ OF SAME STRUCTURE//////	
//	void sum(int i,int j){
//		System.out.println("madhab");
//	}

}
