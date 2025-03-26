package factorial;

public class Mymain {

	public static void main(String[] args) {
		//int c;
		Fact obj=new Fact();
		for(int a=1;a<=5;a++){
			int c =obj.factorial(a);
			System.out.println("factorial of "+a+" = "+c);
		}

	}

}
