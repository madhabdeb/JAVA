
public class Employ {
	
	private String name;
	private int pnt;
	

	public Employ(String name,int pnt){
		this.name=name;
		this.pnt=pnt;
	}
	public int getpnt() {
		return pnt;
	}
	public String getname() {
		return name;
	}
	
	public String eminfo(){
		return name+" ("+pnt+") ";
		
	}

}
   