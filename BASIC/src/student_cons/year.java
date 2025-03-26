package student_cons;

public class year {
	
	int year;
	student info[]=new student[10];		// AN array of student class
	student data;
	
	//	CONSTROCTOR
	
	year(){
		
	}
	year(int yr,student ob,int i){
		this.year=yr;
		data=ob;
		info[i]=data;
	}
	
	
	///////	METHOD
	
	
	void shown(int a){
		System.out.println(year);
		System.out.println(info[a]);
	}
	public String toString(int a){
		String ss;
		ss=" "+info[a]+" ";
		return ss;
	}
	
}
