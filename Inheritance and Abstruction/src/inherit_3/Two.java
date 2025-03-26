package inherit_3;

public class Two extends One {

	int d;
	Two(){
		super();
		d=5;
		
	}
	Two(One ob,int len){
		a=ob.a;
		b=ob.b;
		c=ob.c;
		d=len;
	}
	Two(int same){
		super(same);
		d=same;
		
	}
	Two(int p,int q,int r,int s){
	
//		a=p;
//		b=q;
//		c=r;
		
		/*
		 *    super(p,q,r);
		 */

		super(p,q,r);
		d=s;	
	}
	
	Two (Two ob){
//		super(ob);
		super.a=ob.a;
		super.b=ob.b;
		super.c=ob.c;
		d=ob.d;
	}
	
	
	void out(){
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("sum="+(a+b+c+d));
	}
	
}
