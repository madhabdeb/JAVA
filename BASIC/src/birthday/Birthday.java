package birthday;

public class Birthday {
	private int day;
	private int month;
	private int year;

	public void setvalue(int d,int m,int y){
		day=d;
		month=m;
		year=y;
	}
	
	public String show(){
		String ss;
		
		ss=day+"/"+month+"/"+year;
		return ss;
	}

}
