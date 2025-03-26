package student_categories;

public class student {
	private String name;
	private int roll;
	private birthday date;
	
	public void setvaluestu(String name,int roll,birthday date){
		this.name=name;
		this.roll=roll;
		this.date=date;
	}
	
	public String show(){
		String temp;
		temp="NAME= "+name+"ROLL= "+roll+" "+date.showbd();
		return temp;
						
//		System.out.println("NAME= "+name);
//		System.out.println("ROLL= "+roll);
//		//System.out.println("BIRTHDAY= "+ date.show());
//		System.out.print(date.showbd());
	}

}
