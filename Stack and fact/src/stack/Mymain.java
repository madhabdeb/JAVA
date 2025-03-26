package stack;

public class Mymain {

	public static void main(String[] args) {
		
		Stack stk=new Stack();
		
		for(int a=1;a<=10;a++)
		{
			stk.push(a*2+1);
		}
		for(int a=1;a<=10;a++)
		{
			int v=stk.pop();
			System.out.println(v);
		}


	}

}
