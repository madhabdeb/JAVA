package basic;

import java.io.*;
import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	/////////////////ASSIGN IN DIFFERRENT WAY///////////////////////
	
	int a,b;
		
	String s1="i am madhab";
	String s2=new String("jan");
	StringBuffer s3=new StringBuffer("computerscience");
	System.out.println(s1+ "    "+s2+ "    "+s3);
	String s4=s1+s2;
	System.out.println(s4);
	
	int len=s1.length();
	for(a=0;a<len;a++)
	{
		System.out.println(s1.charAt(a));
	}
	/////////////////   loop by charecter  ///////////////////////	
	
	System.out.println();System.out.println();   
	System.out.println(s1.toString());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println();System.out.println();
	
    /////////////////  libratry  ///////////////////////
	
	boolean x=s1.equalsIgnoreCase(s2);
	//x=0;////////ERROR
	System.out.println(x==true?"ma":"baba  BOOLEAN");
	System.out.println();System.out.println();  
	
	s4=s1.substring(2, 7);
	System.out.println(s4+"    SUBSTRING");
	System.out.println();System.out.println();
	
	
	 /////////////////  STRING ARRAY  ///////////////////////
	
	String str[] = new String[5];      ////2D POSSIBLE///
	String ss;
	System.out.println(" STRING ARRAY ");
	System.out.println();System.out.println();
	
	for(a=0;a<1;a++){
		ss=scan.nextLine();
		str[a]=ss;
	}
	for(a=0;a<1;a++){
		System.out.println(str[a]);
	}
	System.out.println();System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
