package student;

public class student {
	
	String name;
	int roll;
	
	void setvalue(String s,int i){
		name=s;
		roll=i;
	}
	
	student[] stu=new student[30];
	
	void ass(student ob,int a){
		stu[a]=ob;
	}
	
//	student(String s,int i){
//		name=s;
//		roll=i;
//	}
	
	void display(){
		System.out.print(name);
		System.out.print(roll);
	}
	

}
