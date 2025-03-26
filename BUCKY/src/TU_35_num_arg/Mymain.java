package TU_35_num_arg;

public class Mymain {
	
	
	public static void main(String[] args) {
		
		System.out.println(showaver(1,2,3,4,5));
		
	}
	
	public static int showaver(int...a) {
		
		int total=0;
		int n=0;
		for(int p:a){
			total+=p;
			n++;
		}
		System.out.println(total/n);
		return total/n*2;
}
	
}
