package tupoints;

public class Mymaiin {

	public static void main(String[] args) {
	
		//////////////////  contentEquals  //////////////
		String str1 ="Not immutable"; 
		String str2 ="Strings are immutable";
		StringBuffer str3 =new StringBuffer("Not immutable"); 
		boolean result = str1.contentEquals( str2 ); 
		System.out.print(result);
		System.out.println("       contentEquals");
		result = str2.contentEquals( str3 );
		System.out.println( );System.out.println( );
		
		
	    //////////////////copyValueOf //////////////
		char[]Str1={'h','e','l','l','o',' ','w','o','r','l','d'}; 
		String Str2="";
		Str2=Str2.copyValueOf(Str1);
		System.out.println("Returned String: "+Str2);
		Str2=Str2.copyValueOf(Str1,2,6);
		System.out.println("Returned String: "+Str2);
		System.out.println( );System.out.println( );
		String Str=new String("Welcome to Tutorialspoint.com");
		System.out.println(Str.replace('o','T'));
		System.out.println(Str.replaceAll("Tutorials", "AMROOD"));
		
		
		
	}

}
