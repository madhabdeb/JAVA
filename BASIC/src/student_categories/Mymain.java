package student_categories;

import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		birthday bd=new birthday();
		student st=new student();
		department dp;
		
		
		String name,c;
		int roll,day,month,year,stu;
		
		
		System.out.print("how many student in your departmant=");
		stu=scan.nextInt();
			dp=new department(stu);
			
		for(int i=0;i<stu;i++)
		{
		
			System.out.println((i+1)+" STUDENT NAME=");
			c=scan.nextLine();
			name=scan.nextLine();
			
			System.out.println("ROLL=");
			roll=scan.nextInt();
			System.out.println("STUDENT BIRTHDATE=");
			System.out.println("DAY=");
			day=scan.nextInt();
			System.out.println("MONTH=");
			month=scan.nextInt();
			System.out.println("YEAR=");
			year=scan.nextInt();
			
			bd.setvalue(day, month, year);
			
			st.setvaluestu(name, roll, bd);
			
		}
		
		for(int i=0;i<stu;i++)
		{
			dp.display(i);
		}
		
		
	}

}
