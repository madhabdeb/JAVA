
public class T extends Test {

	int c,d;
	void set(int a,int b,int c){
		super.set(a, b);
		this.c=c;
		d=0;
		return;
	}
	
	
	void volume(){
		d=get();
		System.out.println(d+c);
		return;
	}
}
