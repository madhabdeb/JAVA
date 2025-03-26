package TU_39_cons_over_method;

public class Test {
	
	int a=88;
	int b=77;
	Test()
	{
		
	}
	
	Test(int i,int j){
		a=i>3?5:1;
		b=j==7?0:100;
//		a=i;
//		b=j;
	}
	void show(){
		System.out.println(a);
		System.out.println(b);
	}
	

}
