package jd_i_s;

import java.io.*;

public class Mymain {
	
	public static void main(String args[]) throws IOException  {
		int a;
		char c;
		String ss;
		
		DataInputStream din=new DataInputStream(System.in);  ////////method read,readline();
		
//		ss=din.readLine();
//		a=Integer.parseInt(ss);
//		System.out.println(a);
//		
//		ss=din.readLine();
//		a=Integer.parseInt(ss);
//		System.out.println(a);
		
		c=(char)System.in.read();
		System.out.println(c);
	}

}
