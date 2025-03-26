package TU_15;

import java.util.*;

public class Mymain {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);  
		
		String s=scan.nextLine();
		
		Name n=new Name(s);
		
		n.display();
		
		/*
		 * two way te kora jay ===method er argu hishabe===
		 *   n.dispay(n);  bucky has done this way;
		 */
		
		
		System.out.println("over");
		
	}
	

}  
