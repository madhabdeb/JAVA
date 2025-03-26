import java.util.Scanner;


public class Mymain {

	public static void main(String[] args) {
		
		int a,b,c,n,name;
		String ss,sn,st;
		String []str= new String[100];
		
		name=0;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the array size(numbr of names)=");
		n=scan.nextInt();
		ss=scan.nextLine();
		System.out.println();
		
		
		System.out.println("Enter the names in the array string");
		
			for(a=0;a<n;a++){
			ss=scan.nextLine();
			str[a]=ss;
			}
			System.out.println();System.out.println();
		
			System.out.println("Enter your name=");
			sn=scan.nextLine();
			ss=sn;
			
			for(a=0;a<n;a++)
			{
				   st=str[a];
				if(ss.equals(st)){
					name++;	
				}
					
			}
			System.out.println();System.out.println();
			System.out.println("your name is="+ss+" and got it ="+name+"= times");
	}

}
