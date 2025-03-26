package inherit_5;

public class Three extends Two {
	
	int e;
	Three(){
		super();
		e=9;
		
	}
	Three(Two ob,int len){
		super(ob);
		e=len;
	}
	Three(int same){
		super(same);
		e=same;
		
	}
	Three(int p,int q,int r,int s,int t){
	
//		a=p;
//		b=q;
//		c=r;
		
		/*
		 *    super(p,q,r);
		 */

		super(p,q,r,s);
		e=t;	
	}
	
	Three (Three ob){
		super(ob);
//		super.a=ob.a;
//		super.b=ob.b;
//		super.c=ob.c;
		e=ob.e;
	}
	
	void out(){
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("d="+e);
		System.out.println("sum="+(a+b+c+d+e));
	}
	

}
