package factorial;

public class Fact {
	int n;

	void frial(){
		System.out.println(factorial(n));
	}
	int factorial(int n){
		if(n==1)
			return 1;
		else
			return factorial(n-1)*n;
	}
}
