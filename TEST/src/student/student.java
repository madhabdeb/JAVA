package student;

public class student {
	
	private String name;
	private int roll;

	public void setname(String name){
		this.name=name;
	}
	public void setroll(int roll){
		this.roll=roll;
	}
	
	
	public String res(){
		return " "+name+" "+roll+" ";
	}

}
