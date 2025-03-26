package birthday;

import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Person psn=new Person();
		Birthday bth=new Birthday();
		
		String name;
		int a,b,c;
		
		System.out.println("Enter your name :");
		name=scan.nextLine();
		
		System.out.println("And enter your birthday :");
		System.out.println("Day:");
		a=scan.nextInt();
		System.out.println("month:");
		b=scan.nextInt();
		System.out.println("year:");
		c=scan.nextInt();
		
		bth.setvalue(a, b, c);
		psn.setvalue(name,bth);
		
		psn.show();
		
		

	}

}
