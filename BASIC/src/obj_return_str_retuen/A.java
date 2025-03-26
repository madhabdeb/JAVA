package obj_return_str_retuen;

public class A {
	
	int a;
	int b;
	A(int i ,int j){
		a=i;
		b=j;
	}
	
	A get(A obj){
		A g;
		g=new A(5,7);
		return g;
	}
	
	public void show(){
		System.out.println(a);
		System.out.println(b);
	}
	
	public String toString(){
		String s;
		s="A=="+a+"B=="+b+" ";
		return s;
	}

}
