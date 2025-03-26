import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


public class Mymain {

	public static void main(String[] args) {
		///////new/////////
		
		
		String ss;
		try{
			OutputStream outputStream = new FileOutputStream("src/km/ma");
			Writer writer = new OutputStreamWriter(outputStream);

//			writer.write("data");

//			writer.close();
			
//			File ff=new File("src/km/ma");
//			BufferedWriter bw=new BufferedWriter(new FileWriter(ff));
			PrintStream out = new PrintStream(System.out, true, "US-ASCII");
			
			File fileDir = new File("src/km/baba");
	        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir),"US-ASCII"));

			
//			File file=new File("src/km/chacha.txt");
//			FileReader fr=new FileReader(file);
//			BufferedReader br=new BufferedReader(fr);    ////SAME///BufferedReader br=new BufferedReader(new FileReader(file));
			
			
			while((ss=br.readLine())!=null)
			{
//				System.out.println(ss);
				out.println(ss);
//				bw.write(ss);
				writer.write(ss);
//				wd+="  \n";            //////////not possible///////
				
	  /////BufferedWriter has a newLine() method. You can use that, or use a PrintWriter instead, which provides a println() method	
				System.out.println("madhab");
			}
			writer.close();
			br.close();

		 } catch (UnsupportedEncodingException e) 
	        {
	            System.out.println(e.getMessage());
	        } 
	        catch (IOException e) 
	        {
	            System.out.println(e.getMessage());
	        }
	        catch (Exception e)
	        {
	            System.out.println(e.getMessage());
	        }	

	}

}
