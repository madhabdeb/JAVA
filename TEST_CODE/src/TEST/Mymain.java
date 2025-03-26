

package TEST;
import java.util.Scanner;

public class Mymain {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		int a,b,c;
		String ss,ch;	
		
		a=scan.nextInt();
		ch=scan.nextLine();
//		System.out.println(a);
		for(b=1;b<=a;b++){
			ss=scan.nextLine();
			
//			System.out.println(ss);
			
			c=ss.length();
			for(int x=0;x<c;x++){
				if(ss.charAt(x)>ss.charAt(x+1))
				{
					break;
				}
				if((ss.charAt(x)==ss.charAt(x+1)))
				{
				  continue;
				}
			}
			
		}


	}

}
