
public class De {
	
	private String dnm;
	private int bget;
	private int c=0;
	
	void xxx()
	{
		System.out.println(bget);
	}
	
	public De(String dnm){
		this.dnm=dnm;
		this.bget=5;
	}
	
	private Employ[] em=new Employ[5];
	
	void addempee(Employ ob){
		em[c++]=ob;
				
		if(ob.getpnt()<5){ 
			bget+=3;
		} 
		else
			bget+=7;
	}
	
	void dis(){
		String s;
		s="Depart name:"+this.dnm + "\npoint:"+ this.bget;
		for(Employ x:em)
			s+=x.eminfo()+" ";
		
		System.out.println(s);
	}

}
