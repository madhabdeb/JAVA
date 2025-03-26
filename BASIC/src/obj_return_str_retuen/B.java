package obj_return_str_retuen;

public class B {
	int i=5;
	int j=7;
	A ob;
	
   B(int i,int j,A obj){
	   
	   //ob=new A(obj.a,obj.b); 
	   ob=obj;
	   this.i=3;
		this.j=6;  
   }
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
	
	void outt(){
		System.out.println(i);
		System.out.println(j);
		System.out.println(ob);
	}
}
