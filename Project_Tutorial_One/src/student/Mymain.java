package student;
import java.util.*;

public class Mymain {
	
	static Scanner s=new Scanner(System.in);
	static Scanner v=new Scanner(System.in);

	public static void main(String[] args) {
		int i,a;
		String str;
		
		student st=new student();
		student ob=new student();
		for(a=0;a<3;a++){	
			i=s.nextInt();
			str=v.nextLine();
			ob.setvalue(str, i);
			st.ass(ob, a);
		
		}	

	}

}
