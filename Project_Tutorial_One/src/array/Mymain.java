package array;

import java.util.*;

public class Mymain {
	
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s=new Scanner(System.in);
		
		int a,i;
		
		Array ar=new Array();
		//i=s.nextInt();
		for(a=0;a<3;a++){
			
			ar.input(a, a);
		}
		
		for(a=0;a<3;a++){
			ar.out(a);
		}

	}

}
