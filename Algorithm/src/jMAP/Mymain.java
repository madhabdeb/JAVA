package jMAP;
import java.util.*;
import java.util.HashMap;


public class Mymain {

	public static void main(String[] args) {
		
/*
 *  HASHMAP IS ONE KIND OF ARRAY & DYNAMIC ARRAY O ASSOCIATIVE ARRAY 
 *  
 *  SO ATE KEY O VALUE RAKA HOY KEY=UNIK(1) BT VALUE=CAN CHANGE(2) ; 
 *  
 *   HashMap<KEY,VALUE> hm=new HashMap<String,int>();
 *   
 *   map.get()==>index dite hoy & ta value output dew   c_++ find();
 *   map.put()==>key and value set korte use hoy        c++=insert(); 
 *   
 *   
 */
	
		int a,x;
		a=x=1;
		HashMap hm=new HashMap();
		HashMap mp=new HashMap();
		HashMap<String,Integer> map=new HashMap<>();
		
		 hm.put("madhab",1);
		 hm.put("rahel",13);
		 hm.put("murad",40);
		 
		 map.put(new String("madhab"),1);
		 map.put("rahel",13);
		 map.put("murad",40);
		 String key="madhab";
		 map.put(key,map.get(key)+1);
		
		 
//		 hm.put(new String("madhab"),3);
		 
		 System.out.println(map.get("madhab"));
		 
		 
		 

		
	}

}
