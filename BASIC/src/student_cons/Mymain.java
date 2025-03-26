package student_cons;

import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String na,x;
		int r;
		int y,n;
		
		year objyr=new year();
	
		System.out.print("ENTER THE NUMBER of students=");
		
		n=scan.nextInt();
		x=scan.nextLine();			////this is for extra charecter input (press enter)
		
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		System.out.println("");
		
		System.out.println("ENTER THE EACH STUDENTS NAME ,ROLL AND YEAR (CURRENT YR) SEQUENCELY");
		
			
			for(int a=0;a<n;a++)
			{
				
				na=scan.nextLine();
				r=scan.nextInt();
				y=scan.nextInt();
				x=scan.nextLine();			////this is for extra charecter input (press enter)
			
				student stu=new student(na,r);		////OBJECT OF STUDENT
			
				objyr=new year(y,stu,a);	
				
			}   ///END LOOP == FOR INPUT  VALUES//
		
		
			////GIVEN LOOP FOR OUTPUT OF INPUT VALUES
			
			for(int a=0;a<n;a++){	
				
				System.out.println(objyr.toString(a));	
			}
		
		
	}

}
