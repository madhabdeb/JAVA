package factorial;

public class Fact {
	int sum;
	
//	int factorial(int b,int c){
//		
//		int a,sum=1;
//		for(a=1;a<=b;a++)
//		{
//		sum*=a;	
//		}
//		return sum;
//	}
	int factorial (int b){
		if(b==1)
			return 1;
		else
			return b*factorial(b-1); 
		
	}
	
}
