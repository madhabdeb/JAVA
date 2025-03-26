package filemap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Mymain {

	public static void main(String[] args) {
		
		String ss,wd;
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		System.out.println("madhab");
		
		try{
			File ff=new File("src/filemap/pro_file/baba.txt");
			BufferedWriter bw=new BufferedWriter(new FileWriter(ff));
			File file=new File("src/filemap/pro_file/ma.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);    ////SAME///BufferedReader br=new BufferedReader(new FileReader(file));
			while((ss=br.readLine())!=null)
			{
                System.out.println(ss);
				StringTokenizer st=new StringTokenizer(ss," .");
				StringTokenizer sx=new StringTokenizer(ss," .");
				while(st.hasMoreTokens()){
					wd=st.nextToken();
					System.out.println(wd);
					if(hm.get(wd)!=null && hm.get(wd)==1 )
					{
						hm.put(wd,hm.get(wd)+1);
//						System.out.println("hi");
					}
					else
					{
						hm.put(wd,1);
					}
					
//					wd+="  \n";            //////////not possible///////   
/////BufferedWriter has a newLine() method. You can use that, or use a PrintWriter instead, which provides a println() method					
				}
				while(sx.hasMoreTokens()){
					wd=sx.nextToken();
					if(hm.get(wd)==1)
					{
						bw.write(wd);
						bw.newLine();
					}
					
				}
//				System.out.println("madhab");
			}
			bw.close();
			br.close();

		 }catch(Exception e){
			System.out.println("not found");
		}

	}

	

}
