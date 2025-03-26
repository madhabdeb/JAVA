package TU_42_this_obj;

public class Test {
	int m;
	int d;
	int y;
	
	Test(int a,int b,int c){
//		this (a,b,c);

		m=a;
		d=b;
		y=c;
		System.out.printf("thee constroctor for this %s",this);
	}
	public String toString(){
		return String.format("%d %d %d",m,d,y);
	}
		

}
    