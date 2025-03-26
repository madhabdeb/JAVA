package jtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Mymain {

	public static void main(String[] args) {

		String ss,wd,line;
		line=" ";
		
		Scanner scan=new Scanner(System.in);

		ss=scan.nextLine();
		
//		System.out.println(ss);
//		String sp[]={"ma","baba"};///1
	
		StringTokenizer st=new StringTokenizer(ss," ");//////String sp[]=ss.split(" ");/////
		while(st.hasMoreTokens()){
			wd=st.nextToken();
//			String sp[]=st.nextToken();     /////error  coz  assign same time ;///1
			line=line+wd;
			
			System.out.println(wd);
			
		}
		
		System.out.println(line);

	}

}
