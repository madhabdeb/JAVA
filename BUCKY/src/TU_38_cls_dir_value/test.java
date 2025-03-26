package TU_38_cls_dir_value;

public class test {
	
	int a=3;
	int b=4;
	
//	test()
//	{
//		
//	}
	
	test(int a,int b){
		this.a=a;
		this.b=b;
	}
	test(int a){
		this.a=a;
		b=a;
	}
	test(int a,int b,int c){
		this.a=a*c;
		b=b*c;
	}
	void setvalue(int a,int b){
		this.a=a;
		this.b=b;
	}
void show(){
	System.out.println(a+b);
	System.out.println(String.format("%03d %03d",a,b));
			
}

}
