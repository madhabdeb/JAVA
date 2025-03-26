package inherit_7;

public class Mymain {
	public static void main(String[] args) {
			
//		System.out.println("makdhsdf");
		
		Two two=new Two(7,1);
		Two to;
		     to=two.assign(two);
		     
		     to.sum(4);
		
		two.sum(5);
		two.sum();
	}

}
