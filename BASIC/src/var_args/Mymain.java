package var_args;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(1,2,3,4,5,8));
		
	}
	
	public static int sum(int ...x){
		int c=x[0];
		int j=0;
		int n=x.length;
		for(int i=0;i<n;i++){
			j+=x[i];
		}
		return j;
	}

}
