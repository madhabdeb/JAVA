package stack;

public class Stack {
	int siz;
	int[] stk=new int[10];
	
	Stack()
	{
		siz=-1;
	}
	void push(int a){
		if (siz==9)
			System.out.println("stack is full");
		else
			stk[++siz]=a;
	}
	
	int pop(){
		if (siz<0){
			System.out.println("stack is underflow");
			return 0;
		}
		else
		    return stk[siz--];
	}
	
}
