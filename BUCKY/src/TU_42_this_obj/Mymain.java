package TU_42_this_obj;

public class Mymain {

	public static void main(String[] args) {

		Test t=new Test(2,3,4);
		
		Person person=new Person("madhab",t);
		
		System.out.println(person);
		
		

	}

}
