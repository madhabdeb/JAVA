package jfileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mymain {

	public static void main(String[] args)throws IOException {
	
		String ss;
		try{
			System.out.println("hello");
			FileReader fr=new FileReader("ss.txt");
			BufferedReader br=new BufferedReader(fr);
			while((ss=br.readLine())!=null){
				System.out.println(ss);
			}
			
			br.close();
			System.out.println("world");
		 }catch(Exception e){
			System.out.println("not found");
		}
		
	}

}
