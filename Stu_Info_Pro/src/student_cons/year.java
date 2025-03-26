package student_cons;

public class year {
	
	int year;
	static student info[]=new student[10];		// AN array of student class
	student data,item;
	
//	void asign(int x){
//		info=new student[x];
//	}
	
	//	CONSTROCTOR
	
	year(){
		
	}
	year(int yr,student ob,int i){
		this.year=yr;
		data=ob;
		info[i]=data;
		item=info[i];
//		System.out.println(item.toString());
//		System.out.println(item);
//		System.out.println("madhab");
		
	}
	
	
	///////	METHOD
	
	
	public static void shown(int a){
		System.out.println(year);
		System.out.println(info[a]);
	}
	public static String toString(int a){
		String ss;
		ss=" "+info[a]+" ";
		return ss;
	}

	
}
