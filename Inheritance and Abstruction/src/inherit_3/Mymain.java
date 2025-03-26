package inherit_3;

public class Mymain {
	public static void main(String[] args) {
		
//		One one=new One();
		
//		Two two =new Two(one,3);
		Two two =new Two(2,3,4,3);
//		Two two =new Two();
		
		Two two1 =new Two(two);
		
		two.area();
		two1.out();
	}

}
