package TU_48_static;

public class Test {
	
	private final int a;
	int sum;
	
	Test(int x){
		a=x;
	}
	
	void add(){
		sum+=a;
	}
	
//	void show(){
//		System.out.println(sum);
//	}
	
	public String toring(){
		return String.format("sum=%d",sum);
	}
	
}
