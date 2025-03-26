package student_cons;

public class student {

	private String name;
	private int roll;
	
	//	CONSTROCTOR
	
	student(String name,int roll){    
		this.name=name;
		this.roll=roll;
	}
	
	//	METHOD
	
	public void show(){
		System.out.println(name);
		System.out.println(roll);
	}
	public String toString(){
		String ss;
		ss="NAME= "+name+" AND ROLL="+roll;
		return ss;
	}
	
}
