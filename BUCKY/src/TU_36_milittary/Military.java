package TU_36_milittary;

public class Military {
	
	int hour;
	int min;
	int sec;
	
	public void setvalue(int h,int m,int s){
		hour=(h==0||h==12)?0:h%12;
		min=m;
		sec=s;
	}
	
	public String display(){
		
		System.out.println(String.format("%02d:%02d:%02d",hour,min,sec));
		return String.format("%02d:%02d:%02d",hour,min,sec);
		
	}

}
