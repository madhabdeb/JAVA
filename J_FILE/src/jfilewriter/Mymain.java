package jfilewriter;
import java.io.*;

public class Mymain {

	public static void main(String[] args) {
		
		String text="hellow world i love you file reader";
		
		try{
			File file=new File("C:/Users/Madhoab Dev/Desktop/baba.txt");
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			bw.write(text);
			bw.close();
			
		}catch(IOException e){
			System.out.println("problem");
		}
		
		
		
	}

}
