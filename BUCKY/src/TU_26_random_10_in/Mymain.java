package TU_26_random_10_in;

import java.util.Random;
import java.util.Scanner;


public class Mymain {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);  
		Random ran=new Random();
		
		int a,b,c;
		
		System.out.print("total numer=");
		c=scan.nextInt();
		
		Name name=new Name(c);
		
		for(a=0;a<c;a++)
		{
			b=scan.nextInt();
			name.assign(b, a);
			
		}
		
		name.show();
			
		
}  
	
}
