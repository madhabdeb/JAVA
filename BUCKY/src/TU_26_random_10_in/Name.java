package TU_26_random_10_in;

public class Name {
	
	int a,i;
	int sum;
	int size;
	int arr[];	
	Name(int n){
		size=n;
		sum=0;
		arr=new int[size];
	}
	
	public void assign(int a,int i){
		arr[i]=a;
		sum+=a;
	}
	
	public void show(){
		System.out.println(sum);
	}
	
	
	
}
