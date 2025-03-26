package j_i_s_r;

import java.io.*;

public class Mymain {

	public static void main(String[] args) throws IOException {
		
		int a;
		String s;
		char ch;
		
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sr);
		
	
		s=br.readLine();
		a=Integer.parseInt(s);
		System.out.println(a);	
	}

}
