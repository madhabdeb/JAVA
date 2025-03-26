package obj_retuen;

public class B {
	int i=5;
	int j=7;
	
	B(int i ,int j){
		this.i=i;
		this.j=j;
	}
	void display(B obj)
	{
		int a=0;
		
		 a=obj.i;
		 i=obj.j;
		 j=a;
	}
	
	void out(){
		System.out.println(i);
		System.out.println(j);
	}
}
