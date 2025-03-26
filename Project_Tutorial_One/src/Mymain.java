
public class Mymain {

	public static void main(String[] args) {
		
		Employ al =new Employ("alex",6);
		Employ ap =new Employ("apple",7);
		Employ an =new Employ("anna",3);
		
		Employ jn =new Employ("jhon",4);
		Employ li =new Employ("linda",6);
		
		
		De s =new De("sale");
		De i =new De("it");
		
		s.addempee(al);
		s.addempee(ap);
		s.addempee(an);
		
		i.addempee(jn);
		i.addempee(li);
		
		s.dis();
		i.dis();
		
		
		
		

	}

}
