package nested_class;

public class nested {
	int a=3 ;
	int b=7;
	
	void display(){
		innernest nst =new innernest();
		nst.out();
		
	}
	
	class innernest{
		
		void out(){
			System.out.println(a+b);
			System.out.println("madhab");
		}
	}

}
