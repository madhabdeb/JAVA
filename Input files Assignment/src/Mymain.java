import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Mymain {

	public static void main(String[] args) {
		
		String ss,s;
		
		try{
			File ff=new File("src/default package/fileone.txt");
			BufferedWriter bw=new BufferedWriter(new FileWriter(ff));
			File file=new File("src/default package/filetwo.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);    ////SAME///BufferedReader br=new BufferedReader(new FileReader(file));
			while((ss=br.readLine())!=null)
			{

				bw.write(ss);
//				wd+="  \n";            //////////not possible///////
				bw.newLine(); 
			    /////BufferedWriter has a newLine() method. You can use that, or use a PrintWriter instead, which provides a println() method	
				System.out.println("madhab");
			}
			bw.close();
			br.close();

		 }catch(Exception e){
			System.out.println("not found");
		}

		
		
	}

}

