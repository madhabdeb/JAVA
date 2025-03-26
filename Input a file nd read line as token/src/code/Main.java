package code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
	
		int a,b,c;
		String ss;
		String wd,line,total;
		line=" ";
		total=" ";
		
		try{

			File file=new File("src/files/input.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);    
			while((ss=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(ss,"$,%,!,^,");
				while(st.hasMoreTokens()){
					wd=st.nextToken();
					line=line+wd;
				}
				total+=line;

			}
			br.close();

		 }catch(Exception e){
			System.out.println("not found");
		}
//        System.out.println(total);
		
		
		for(a=0;a<=total.length();a++){
			System.out.println(charAt());
		}
		

	}

}
