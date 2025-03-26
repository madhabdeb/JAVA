package inherit_8;

public class Two extends One {
	
	int a,b;
	
//	Two(){
////		super(2,3);
//		a=7;
//		
//	}
	
	Two(int i){
//		super(i);
		this.a=3;
		this.b=1;
	}
	Two(int i,int j){
//		super(i,j);
		a=i;
		b=j;
	}
	Two assign(Two obj){
		Two tmp;
		  tmp=new Two(obj.a,obj.b);
		  return tmp;
	}
	void sum(int i){
		System.out.println(a+b);
	}
}
