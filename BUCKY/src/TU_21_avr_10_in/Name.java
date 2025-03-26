package TU_21_avr_10_in;

public class Name {
	
	int value;
	int n;
	int total;
	
	public void setvalue(int i,int j){
		n=i;
		total=j;
	}
	
	void sum(int a){
		total+=a;
	}
	
	void show(){
		System.out.println("total average = "+total/n);
	}
	
}
