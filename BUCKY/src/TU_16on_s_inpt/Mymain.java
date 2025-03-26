package TU_16on_s_inpt;

import java.util.Scanner;

public class Mymain {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in); 
		GF gf=new GF();
		
		String str;
		
		System.out.print("ENTER YOUR GF NAME=");
		str=scan.nextLine();
		
		
		
		gf.sets(str);
		System.out.print("YOUR GF IS=");
		gf.show();
		
		
		
		
		System.out.println("over");
		
	}
	

}  
