package inherit_7;

public class One {
	 int a;
	 int b;
	
	One(){
		a=77;
		b=2;
	}
	One(int i){
		a=3;
		b=3;
	}
	One(int a,int b){
		this.a=a;
		this.b=b;
	}
	void sum(){
		System.out.println(a+b);
	}

}
