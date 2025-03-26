package jfilereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Mymain {

	public static void main(String[] args) {
		
		
		String ss;
		int x=1;
		
		try{
			File file=new File("C:/Users/Madhoab Dev/Desktop/ma.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);    ////SAME///BufferedReader br=new BufferedReader(new FileReader(file));
			while((ss=br.readLine())!=null){
				System.out.println(ss);
				System.out.println(x++);
			}
			
			br.close();
			System.out.println("world");
		 }catch(Exception e){
			System.out.println("not found");
		}

	}

}
