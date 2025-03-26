package TU_42_this_obj;

public class Person {
	String name;
	Test birthday;
	
	Person(String s,Test thedate){
		name=s;
		birthday=thedate;
	}
	public String toString(){
		return String.format("my name is %s and my birthday is %s",name,birthday);
	}

}
