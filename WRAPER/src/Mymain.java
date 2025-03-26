
public class Mymain {

	public static void main(String[] args) {
		
		////// USED TO CONVERT VALUE OF PRIMITIVE TO OBJECT AND OBJ TO PRIMITIVE
	   //////  EIGHT DATA TYPES MAKES THAT CLASS
	
		int a,b,m=7;
		
		
		Integer obj=new Integer(5);   //same obj=9;  	////obj to primitive///unboxing//ASSIGN
		Integer ob=Integer.valueOf(m);   			///PARSTINT HOBE NA COZ NOT CONVERTING
		
			a=obj.intValue();
//SAME		a=obj;
		System.out.println(a);
       
        
        
		//////////////   STRING TO INTEGER    ////////////////
        String st,ss="12345";
        m=Integer.parseInt(ss);			////TARGET TO INTEGER
        System.out.println(m);
        System.out.println( );System.out.println( );
        
        
        
        ///////////  INTEGER TO STRING  /////////////////// TO STSRING RETURN A STRING OBJ
        int x=2348;
        String s=Integer.toString(x);			////TARGET TO STRING
        s=s+"madhab" ;
        System.out.println(s);
        System.out.println( );System.out.println( );
        
        
        
        ////////////   STRING TO FLOAT   ////////////////
       st="3.2323";
       float f;
       f=Float.parseFloat(st);
       System.out.println(f);
       System.out.println( );System.out.println( );
       
      
        
	}

}
