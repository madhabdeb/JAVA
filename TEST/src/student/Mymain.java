package student;

import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner (System.in);
		
		student st=new student();
		dement dp =new dement();
		dement dt =new dement();
		dement dc =new dement();
		
		String name;
		int roll;
		
		name=scan.nextLine();
		st.setname(name);
		roll=scan.nextInt();
		st.setroll(roll);
		
//		System.out.println(st.res());
		name=scan.nextLine();
		name=scan.nextLine();	
		dp.setvalue(name, st);
		dp.show();
		
		name=scan.nextLine();
		st.setname(name);
		roll=scan.nextInt();
		st.setroll(roll);
		name=scan.nextLine();	
		
		
		name=scan.nextLine();	
		dt.setvalue(name, st);
		dt.show();
		
		
//		dc.dname=dp.dname;
//		dc.sname=dp.sname;
//		
//		dp.dname=dt.dname;
//		dp.sname=dt.sname;
//		
//		dt.dname=dc.dname;
//		dt.sname=dc.sname;
		
		System.out.println("--------------------------------");
		dp.show();
		
		System.out.println("---------------------------------");
		dt.show();
		
		
		
				
		
		
		
		
	}

}
