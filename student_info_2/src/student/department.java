package student;


public class department {
	
	private student arr[],stt;
	//private int n;
	//private static int x;
	
	public void arrsize(int n){
		arr=new student[n];
		
	}
	public void assign(student ob,int i){
		stt=ob;
		arr[i]=stt;
	System.out.println("mmmmmmmmmmmmmmmmmmmmmm"+arr[i].toString());
	
//		System.out.println(arr[i]);
		
	}
	public student getaarr(int i){
		student ob;
		ob=arr[i];
	return ob;
		
	}
	
	public String result(int i){
		student st;
		String ss;
		st=arr[0];
		ss=" "+st.toString()+" ";	
		return ss;	
	}
	
	public void show (student ob){
		
		System.out.println(ob.toString());
		
	}
	public void shown(){
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}
	
	
	
	
	
}
