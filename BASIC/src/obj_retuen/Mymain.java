package obj_retuen;

public class Mymain {

	public static void main(String[] args) {
		A obj=new A(6,3);
		A t=new A(0,0);
		obj.show();
		
		
		A b;
		b=obj.get(obj);
		b.show();
//		obj.show();
		System.out.println("-----------============-----------");		
	    System.out.println("-------interchange---------object value------");
		t=obj;
		obj=b;
		b=t;
		System.out.println("A=");
		obj.show();
		System.out.println("B=");
		b.show();
		System.out.println("-----------============-----------");	
		
		
/*
 * for class bbb 
 */
		B c =new B(2,3);
		c.out();
		
		System.out.println("-----------============-----------");
		
		c.display(c);
		c.out();

}
}
