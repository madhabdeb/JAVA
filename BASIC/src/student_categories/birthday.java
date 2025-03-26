package student_categories;

public class birthday {
	
	private int day;
	private int month;
	private int year;
	
	public void setvalue(int d,int m,int y){
		day=d;
		month=m;
		year=y;
	}
	
	public birthday getvalue(){
		
		birthday bday=new birthday();
		
		bday.day=day;
		bday.month=month;
		bday.year=year;

		return bday;
		
	}
//	public void show(birthday ob){
//		System.out.print(ob.day+"/"+ob.month+"/"+ob.year);
//	}
	
	
	public String showbd(){
		return "("+day+"/"+month+"/"+year+")";
	}

}
