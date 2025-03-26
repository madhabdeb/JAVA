package para;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Scanner;


public class Mymain {

	public static void main(String[] args) {
		
		HashMap<Charecter,Integer> hm=new HashMap<Charecter,Integer>();
		
		int a,b,c;
		String ss;
		String wd,line,total;
		line=" ";
		total=" ";
		
		try{

			File file=new File("src/filemap/pro_file/baba.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);    
			while((ss=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(ss," ");
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

		char ch;
		  for(int j=0;j<total.length();j++)
		  {
	              System.out.println(total.charAt(j));
	             
	              if(hm.get(wd)!=null && hm.get(wd)==1 )
					{
						hm.put(wd,hm.get(wd)+1);
//						System.out.println("hi");
					}
					else
					{
						hm.put(wd,1);
					}
		  }
		  
	}

}
