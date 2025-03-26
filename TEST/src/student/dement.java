package student;

public class dement {
	String dname;
	student sname;
	
	public void setvalue(String dname,student sname){
//		this(dname,sname);
		this.dname=dname;
		this.sname=sname;
	}
	
	void show(){
		student s;
		System.out.println("departmant name"+dname);
		System.out.println("student name and roll"+sname.res());
	}
	
	

}
