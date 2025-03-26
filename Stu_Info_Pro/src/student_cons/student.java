package student_cons;

public class student {

	public String name;
	public int roll;
	
	//	CONSTROCTOR
	
	public student(String name,int roll){    
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
	public String getstu(){
		String ss;
		ss="NAME= "+name+" AND ROLL="+roll;
		return ss;
	}
}
