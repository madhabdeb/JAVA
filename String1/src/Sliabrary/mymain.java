package Sliabrary;

public class mymain {

	public static void main(String[] args) {
		
		//////////////////  LENGTH  //////////////
		String s="madhab";
		String bai="joyjuti";
		int a=s.length();
		System.out.print(a);
		System.out.println("   LENGTH");
		System.out.println( );
		
		
		
		//////////////////  charAt  //////////////  char ter ber korter use hoy/
		char ch=s.charAt(3);
		System.out.print(ch);
		System.out.print("   CHAR AT");
		System.out.println( );
		System.out.println( );
		
		
		
       ////////////////// setCharAt  //////////////  index a char set korte use hoy / 	
		System.out.println(bai);
		System.out.println( );
		System.out.println( );
		
		
		
		////////////////// indexOf  //////////////  index er charecter bole dey /
		 //////////////////LASTindexOf  //////////////  index er charecter bole dey /
		bai="damo is my little brother and he is vry good boy";
		System.out.print(bai.indexOf('t'));
		System.out.print("   INDEXOF");
		System.out.println( );System.out.println( );
		System.out.print(bai.indexOf('o',5));
		System.out.print("   INDEXOF after 5 char");
		
		System.out.println( );System.out.println( );
		
		System.out.print(bai.indexOf("is"));	
		System.out.print("   INDEXOF GIVEN STRING");
		System.out.println( );System.out.println( );
		System.out.print(bai.indexOf("is",7));
		System.out.print("   INDEXOF after 7 CHAR STRING");
		System.out.println( );System.out.println( );
		
		
		
		//////////////////  toUpperCase  //////////////  convert  /
		System.out.print(bai.toUpperCase());
		System.out.println("   TOUPPERCASE");
		System.out.println(bai);
		System.out.println( );System.out.println( );
		
		
		
		//////////////////toLowerCase  //////////////  convert  /
		System.out.print(bai.toLowerCase());
		System.out.println("   TOLOWERCASE");
		System.out.println(bai);
		System.out.println( );System.out.println( );
		
		
		
		//////////////////  compareTo  //////////////  if equal return 0 else 1  /
		int i=s.compareTo(s);				//use it in sorting//
		System.out.print(i);
		System.out.println("   COMPARETO");
		System.out.println( );System.out.println( );
		
		
		
		
		//////////////////   compareToIGNORE CASE  //////////////  if equal return 0 else 1  /
		s="MADHAB";
		bai="madhab";		
		System.out.print(s.compareToIgnoreCase(bai));				//use it in sorting//
		System.out.println("   COMPARETO IGNORECASE");
		System.out.println( );System.out.println( );
		
		
		
		//////////////////  reverse  //////////////  to resverse /	
//		bai.reverse();
//		System.out.println(s.reverse());
		
		
		
		
		////////////////// concat   //////////////  return boolean type  /	
		bai="damu";
		String ss=s.concat(bai);
		System.out.print(ss);
		System.out.println("   CONCATE");
		System.out.println( );System.out.println( );
		ss=s+bai;
		System.out.print(ss);System.out.println("   +");
		bai="damu";
		System.out.println( );System.out.println( );
		
		
		
		
		//////////////////    insert   //////////////  return boolean type  /		
//			 String sp=s.insert(2,bai);
//			 System.out.println(s);
//			 ss="i am madhab";
//			 bai="damu";
//			 StringBuffer s3=new StringBuffer("love");
//			ss=ss.insert(0,"ma");
		
		
		
		
		//////////////////   substring   //////////////    /		
		 ss="i am madhab";
		 bai="damu";
		 String s3=ss.substring(2);
		 System.out.print(s3);
		 System.out.println("   SUBSTRING FROM INDEX TO NULL");
		 System.out.println( );System.out.println( );
		 
		 s3=ss.substring(2,7);
		 System.out.print(s3);
		 System.out.println("   SUBSTRING FROM INDEX TO INDEX");
		 System.out.println( );System.out.println( );
		 
		 
		 
		 
		 //////////////////		replace   ////////////////// 
		 ss="i am madhab";
		 bai="damu";
		 ss=ss.replace('m', 'j');
		 System.out.print(ss);
		 System.out.println("   REPLACE BY CHAR");
		 System.out.println( );System.out.println( );
		 ss=ss.replace("aj","AM");
		 System.out.print(ss);
		 System.out.println("   REPLACE BY STRING");
		 System.out.println( );System.out.println( );
		 
		
		 
		 
		 //////////////////		TOSTRING    //////////////////
		 String s4=new String(bai.toString());   /////// String s4=new String(bai)///SAME//
		 System.out.print(s4);
		 System.out.println("   TOSTRING");
		 System.out.println( );System.out.println( );
//		 BOX B=new BOX();
//		 syso(B);
		 
		 
		 
		 
		 
		/////////////////  SPLIT   ///////////////////////
		ss="hello i am madhab deb";
		String sp[]=ss.split(" ");
		for(a=0;a<sp.length;a++){
			System.out.println(sp[a]);
		}
		System.out.println();
		System.out.println("****SPLIT**** ");
		System.out.println();System.out.println();
		 
		
		
		
		/////////////////  EQUALS   ///////////////////////		
		ss="madhab";
		bai="damo";						///we can't use it in sorting//
		boolean x;
		x=ss.equals(bai);
		System.out.print(x);
		
		System.out.println("     EQUALS");
		System.out.println();System.out.println();
		
		
		
		//////////////////equalsIgnoreCase  //////////////  return boolean type  /		
		s="MADHAB";
		bai="madhab";
	    x=bai.equalsIgnoreCase(s);
		System.out.print(x);
		System.out.println("   EQUALIGNORECASE  BOOLEAN");
		System.out.println( );System.out.println( );
		
		
		
		
		/////////////////  STARTSWITH   ///////////////////////		
		System.out.print("madhab".startsWith("ma"));
		System.out.println("     starts with");         ///return boolen type//
		System.out.print("madhab dev".endsWith("dev"));    ///return boolen type//
		System.out.println("     Endswith");
		System.out.println();System.out.println();
		
		
		 //////////////////		TRIM   //////////////////
		ss="                 hello      ".trim();
		System.out.println(ss);
		
		 //////////////////		END   //////////////////
		
		
		
	
		
		
		
		
		
		
	}

}
