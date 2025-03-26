package TU_21_avr_10_in;

import java.util.*;

public class Mymain {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);  
		
		Name ob = new Name();
		int a,b,c;
		
		System.out.print("how many number u want to sum");
		c=scan.nextInt();
		
		System.out.println("ehter the number");
		
		ob.setvalue(c, 0);
		
		for(a=0;a<c;a++){
			b=scan.nextInt();
			ob.sum(b);
		}
		
		ob.show();
}  
}
