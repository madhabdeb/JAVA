package TU_26_random_10_in.map;

import java.util.Random;
import java.util.Scanner;

public class Mymain {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);  
		Random ran=new Random();
		
		int a,b,c;
		int arr[]=new int[5];
		
		for(a=1;a<=100;a++){
			arr[1+ran.nextInt(5)]++;
		}
		
//		for(int x:arr)
//			System.out.println(x);	
//		for(a=0;a<arr.length;a++)
//			System.out.println(arr[a]);
//			
		
		
}  
	
}
