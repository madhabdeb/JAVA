package birthday;

public class Person {

	private String name;
	private Birthday date;
	
	public void setvalue(String s,Birthday ob){
		name=s;
		date=ob;
	}
	
	public void show (){
	System.out.print("hey"+name+"your birthday is on");	
	System.out.println(date.show());
	}
	
}
