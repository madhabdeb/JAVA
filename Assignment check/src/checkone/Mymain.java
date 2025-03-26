package checkone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.*;
import java.util.StringTokenizer;
import java.util.Vector;
public class Mymain {

	public static void main(String[] args) {
		
		
		int a=1;
		HashMap<String,Integer> hm=new HashMap<String,Integer>();		
		Map<String,Integer> mp=new HashMap<String,Integer>();
		Set<String> sets =new HashSet<String>();
		Vector<String> vec = new Vector<String>();
		System.out.println("madhab");
		
		try{
			
			String ss,wd;
			File ff=new File("src/checkone/pro_file/ma.txt");
			BufferedWriter bw=new BufferedWriter(new FileWriter(ff));
			
			File file=new File("src/checkone/pro_file/baba.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);    ////SAME///BufferedReader br=new BufferedReader(new FileReader(file));
			
		
			
			while((ss=br.readLine())!=null)
			{
            
				StringTokenizer st=new StringTokenizer(ss," .");
				StringTokenizer sx=new StringTokenizer(ss," .");
				while(st.hasMoreTokens()){
					wd=st.nextToken();
					//System.out.println(wd);
					if(hm.get(wd)!=null)
					{
						hm.put(wd,hm.get(wd)+1);				
					}
					else
					{
						hm.put(wd,1);
					}					
				}
			System.out.println(hm.size());
			
			Iterator<Map.Entry<String, Integer>> mapIterator = hm.entrySet().iterator();
			while (mapIterator.hasNext()) {
			    Map.Entry<String,Integer> entry = mapIterator.next();
			    System.out.println(entry.getKey() + ": " + entry.getValue());
			}   
				while(sx.hasMoreTokens()){
					wd=sx.nextToken();
					if(hm.get(wd)==1)
					{
						bw.write(wd);
						bw.newLine();
					}	
				}
			}
			
			bw.close();
			br.close();
			

		 }catch(Exception e){
			System.out.println("not found");
		}
	}
}
