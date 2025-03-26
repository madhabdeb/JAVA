package student;

import java.util.Scanner;


public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		student st=new student();
		department dp=new department();
		
		String name,c;
		String ss;
		int roll,stu;
		
		System.out.print("how many student in your departmant=");
		stu=scan.nextInt();
		dp.arrsize(stu);

		for(int a=0;a<stu;a++){
			
			System.out.println((a+1)+" STUDENT NAME=");
			c=scan.nextLine();
			name=scan.nextLine();
			
			System.out.println("ROLL=");
			roll=scan.nextInt();
			
			st.setvaluestu(name,roll);
			dp.assign(st,a);
//			ss=st.show();
			
//			System.out.println(ss);
		}
		
//		for(int a=0;a<stu;a++){
//			
////			System.out.println(dp.result(a));
//			student s;
//			s=dp.getaarr(a);
//			dp.show(s);
//		}
		
		dp.shown();
	}

}
