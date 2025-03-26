package tutorialpoint;

public class Mymain {

	public static void main(String[] args) {
		int a,b,c;
		

		Integer m=7;		///  same as	Integer m=new Integer(5);	
		Integer n=7;
		String s="7";
//		System.out.println(m);
		
		
		////////////////// value  //////////////  use type casting and use class
		float f=m.floatValue();		 ///same as     float f=(float)m;
		System.out.println(f);
		System.out.println( );System.out.println( );
		
		
		
		//////////////////valueOf and equals same  //////////////  use to compare obj<=>numb er   but data type may be same or error or false
		System.out.println(m==7?1:0);
//		System.out.println(m==s?1:0);     ///ERROR
		System.out.println(m.compareTo(n));
		System.out.println(m.equals(n));
		System.out.println( );System.out.println( );
		
				
		
		//////////////////valueOf  ////////////// 
		Integer x =Integer.valueOf(9); 
		Integer p =Integer.valueOf(m); 
		Double d =Double.valueOf(5); 
		Float gg=Float.valueOf("80"); 
		System.out.println(x);
		System.out.println( );System.out.println( );
		
		
		
		//////////////////  END  ////////////// 
		
	}

}
