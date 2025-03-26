package obj_return_str_retuen;

public class Mymain {

	public static void main(String[] args) {
		A a=new A(7,9);
		A ao=new A(77,99);
		a.show();
		System.out.println("-----------------------------");	
		B b =new B(2,3);
		b.out();
		System.out.println("-----------------------------");
		B bb =new B(2,3,a);
		bb.outt();
		
		System.out.println("-----------------------------");
		B bu =new B(2,3,ao);
		bu.outt();
		System.out.println("-----------------------------");
		bb.outt();
		

}
}
