package inherit_5;

public class One {
	int a;
	int b,c;
	
	One(){
		a=7;
		b=9;
		c=4;
	}
//	One(One ob){
//		a=ob.a;
//		b=ob.b;
//		c=ob.c;
//	}
	One(int same){
		a=b=c=same;
	}
	One(int i,int j,int k){
		a=i;
		b=j;
		c=k;
	}
	One(One ob){
		a=ob.a;
		b=ob.b;
		c=ob.c;
	}
	int area(){
		System.out.println(a+b);
		return 0;
	}

}
