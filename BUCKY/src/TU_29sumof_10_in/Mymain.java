package TU_29sumof_10_in;

import java.util.Random;
import java.util.Scanner;


public class Mymain {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);  
		Random ran=new Random();
		
		int a,r;
		float f;
		
		for(a=1;a<5;a++)
		{
			r=1+ran.nextInt(10);   ///////ek ta limit dite hoy ;
			f=100*ran.nextFloat();
			
			System.out.println(f);
			
			System.out.println(r);
			
			
			r=(int)f;
			System.out.println(r);
		}
		
		
		
}  
	
}
