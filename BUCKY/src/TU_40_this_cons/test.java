package TU_40_this_cons;

public class test {
	int hour;
	int min;
	int sec;
	
	test(){
	
		this(0,0,0);  /////////THIS CONSTROCTOR////////
	}
	test(int h){
		this(h,0,0);
	}
	
	test(int h,int m){
		this(h,m,0);                  /////////THIS CONSTROCTOR////////
	}
	
	test(int h,int m,int s){
		settime(h,m,s);                 /////////THIS CONSTROCTOR////////
	}
	
	void settime(int h,int m,int s){
		seth(h);
		setm(m);
		sets(s);
	}
	
	void seth(int h){
		hour=h;
	}
	void setm(int m){
		min=m;
	}
	void sets(int s){
		sec=s;
	}
	int geth(){
		return hour;
	}
	
	int gets(){
		return sec;
	}
	
	int getm(){
		return min;
	}
	
	public String show(){
		//return String.format("%02d:%02d:%02d:",hour,min,sec);
		
		return String.format("%02d:%02d:%02d:",geth(),getm(),gets());
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
