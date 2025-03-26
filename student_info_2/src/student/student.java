package student;

public class student {
	
	private String name;
	private int roll;
	
	public void setvaluestu(String name,int roll){
		this.name=name;
		this.roll=roll;
		
	}
	
	public String toString(){
		String temp;
		temp="NAME= "+name+"ROLL= "+roll+" ";
		return temp;
	}	

}
