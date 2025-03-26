package student_categories;

public class department {
	
	private student arr[];
	private int n;
	
	department(int n){
		arr=new student[n];
		this.n=n;
	}
	
	public void setvalue(student ob,int i){
		int x=i;
		arr[x]=ob;
		
	}
	
	public void display(int i){
		student res;
		res=arr[i];
		res.show();
	}
	
	

}
