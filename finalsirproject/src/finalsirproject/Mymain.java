package finalsirproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.math.*;


public class Mymain {

	public static void main(String[] args) {
		
					///MAP FOR FOUR FILES///
		HashMap<String,Integer> hminal=new HashMap<>();	
		HashMap<String,Integer> hmnal=new HashMap<String,Integer>();
		HashMap<String,Integer> hmispts=new HashMap<String,Integer>();
		HashMap<String,Integer> hmtain=new HashMap<String,Integer>();
		
		HashMap<String,Integer> mdoc=new HashMap<String,Integer>();//ALL WORD IN ONE//
		HashMap<String,Double> wdidf=new HashMap<String,Double>();//ALL WORD IDF //
		
		HashMap<String,Integer> hmqry=new HashMap<String,Integer>();//QUERY TF//
		HashMap<String,Integer> hmqrydoc=new HashMap<String,Integer>();//QUERY DF//
		HashMap<String,Double> hmqryidf=new HashMap<String,Double>();//QUERY IDF//
		
		HashMap<String,Double> hmdoc1=new HashMap<String,Double>();
		HashMap<String,Double> hmqrydoc1=new HashMap<String,Double>();
		HashMap<String,Double> hmdoc2=new HashMap<String,Double>();
		HashMap<String,Double> hmqrydoc2=new HashMap<String,Double>();
		HashMap<String,Double> hmdoc3=new HashMap<String,Double>();
		HashMap<String,Double> hmqrydoc3=new HashMap<String,Double>();
		HashMap<String,Double> hmdoc4=new HashMap<String,Double>();
		HashMap<String,Double> hmqrydoc4=new HashMap<String,Double>();
		
		Map<String,Integer> mp=new HashMap<String,Integer>();
		Set<String> sets =new HashSet<String>();
		Vector<String> vec = new Vector<String>();
		
		double A,B,doc1,doc2,doc3,doc4,X,Y;
		A=B=X=Y=doc1=doc2=doc3=doc4=0;
		
		try{
			String ss,ss1,ss2,ss3,ss4,ss5,sc,wd;
			ss1=ss2=ss3=ss4="";
			ss="";
			
			/// READ ALL FILES ///
			 BufferedReader ck= new BufferedReader(new FileReader("src/com_fls/international.txt"));
			 BufferedReader mr= new BufferedReader(new FileReader("src/com_fls/sports.txt"));
			 BufferedReader pk= new BufferedReader(new FileReader("src/com_fls/national.txt"));
			 BufferedReader rj= new BufferedReader(new FileReader("src/com_fls/intertainment.txt"));
			 BufferedReader qy= new BufferedReader(new FileReader("src/com_fls/query.txt"));
			 BufferedWriter bw= new BufferedWriter(new FileWriter("src/com_fls/a.txt"));
			
			 //==============================//
			 //****** international.txt******//
			//==============================//
			 
			 while((ss1=ck.readLine())!=null)
				{
				 StringTokenizer st=new StringTokenizer(ss1,"., ,,,:,',|,\n,;");
					while(st.hasMoreTokens())
					{
						wd=st.nextToken();
						if(hminal.get(wd)!=null)
						{
							hminal.put(wd,hminal.get(wd)+1);				
						}
						else
						{
							hminal.put(wd,1);
							ss+=wd+" ";
							 
							if(mdoc.get(wd)!=null)
							{
								mdoc.put(wd,mdoc.get(wd)+1);
							}
							else
							{
								mdoc.put(wd,1);		
							}	
						}					
					}
				}
			//==============================//
			   //****** sports.txt******//
			//==============================//
			 
			 while((ss2=mr.readLine())!=null)
				{
				 StringTokenizer sx=new StringTokenizer(ss2,"., ,,,:,',|,\n,;");
				 while(sx.hasMoreTokens())
					{
						wd=sx.nextToken();
						if(hmispts.get(wd)!=null)
						{
							hmispts.put(wd,hmispts.get(wd)+1);				
						}
						else
						{
							hmispts.put(wd,1);
							ss+=wd+" ";
							if(mdoc.get(wd)!=null)
							{
								mdoc.put(wd,mdoc.get(wd)+1);
							}
							else
							{
								mdoc.put(wd,1);	
							}
						}					
					}
				}			 
			//==============================//
			 //****** national.txt******//
			//==============================//
			 
			 while((ss3=pk.readLine())!=null)
				{
				 StringTokenizer xt=new StringTokenizer(ss3,"., ,,,:,',|,\n,;");
				 while(xt.hasMoreTokens())
					{
						wd=xt.nextToken();
						if(hmnal.get(wd)!=null)
						{
							hmnal.put(wd,hmnal.get(wd)+1);				
						}
						else
						{
							hmnal.put(wd,1);
							ss+=wd+" ";
							if(mdoc.get(wd)!=null)
							{
								mdoc.put(wd,mdoc.get(wd)+1);
							}
							else
							{
								mdoc.put(wd,1);	
							}
						}					
					}
				}		 
			//==============================//
			 //****** entertainment.txt******//
			 //==============================//
			 while((ss4=rj.readLine())!=null)
				{
				 StringTokenizer zx=new StringTokenizer(ss4,"., ,,,:,',|,\n,;");
				 while(zx.hasMoreTokens())
					{
						wd=zx.nextToken();
						if(hmtain.get(wd)!=null)
						{
							hmtain.put(wd,hmtain.get(wd)+1);				
						}
						else
						{
							hmtain.put(wd,1);
							ss+=wd+" ";
							if(mdoc.get(wd)!=null)
							{
								mdoc.put(wd,mdoc.get(wd)+1);
							}
							else
							{
								mdoc.put(wd,1);	
							}
						}					
					}
				}
			 
		
			//==============================//
			 //****** EACH WORD IDF******//
			 //==============================//
			 Iterator<Map.Entry<String, Integer>> mapIterator = mdoc.entrySet().iterator();
				while (mapIterator.hasNext()) {
				    Map.Entry<String,Integer> entry = mapIterator.next();
				    String sp;
				    sp=entry.getKey();
				    int idf=entry.getValue();   
				    double d=Math.log(4.0/(1.0*idf))/Math.log(2);
				    wdidf.put(sp,d);
				} 
				
				
				//==============================//
				 //******    QUERY.TXT   ******//
				 //==============================//
							
		
				while((ss5=qy.readLine())!=null)
					{
					 StringTokenizer ry=new StringTokenizer(ss5,"., ,,,:,',|,\n,;");
					 while(ry.hasMoreTokens())
						{
							wd=ry.nextToken();
							if(hmqry.get(wd)!=null)
							{
								hmqry.put(wd,hmqry.get(wd)+1);				
							}
							else
							{
								hmqry.put(wd,1);
								if(hmqrydoc.get(wd)!=null)
								{
									hmqrydoc.put(wd,hmqrydoc.get(wd)+1);
								}
								else
								{
									hmqrydoc.put(wd,1);	
								}
							}					
						}			
					}
				 Iterator<Map.Entry<String, Integer>> mapIter = hmqrydoc.entrySet().iterator();
					while (mapIter.hasNext()) 
					{
					    Map.Entry<String,Integer> entry = mapIter.next();
					    String sp;
					    sp=entry.getKey();
					    int idf=entry.getValue();
					    double d=Math.log(4.0/(1.0*idf))/Math.log(2);
					    hmqryidf.put(sp,d);
					} ////  end the idf of query  ////
				
			 
					double p,q,cal;
					p=q=0;
					X=Y=doc1=0;
					
					//==============================//
					 //******    DOC1   ******//    HERE DOC=(TF*IDF)*UNIT VECTOR
					 //==============================//
					
				    //System.out.println("lllllllllllllllll");
					for(String name:hminal.keySet())
					{
						A=0;
						A=hminal.get(name)*wdidf.get(name);    //TF*IDF(1)
						p+=A*A;
						hmdoc1.put(name,A);		//WORD-- VALUE//
						//System.out.println(name+"  "+hminal.get(name)+"  "+wdidf.get(name)+" "+p);
					}
					for(String name:hmqry.keySet())  
					{
						B=0;				
						B=hmqry.get(name)*hmqryidf.get(name);   //TF*IDF OF QUARE
						q+=B*B;
						hmqrydoc1.put(name,B);					//WORD-- VALUE//(3)
						//System.out.println(name+"  "+hmqry.get(name)+"  "+hmqryidf.get(name)+" "+q);		
					}
					for(String name:hmqry.keySet())
					{	
						if(hmdoc1.get(name)!=null)
						{
							X+=hmqrydoc1.get(name)*hmdoc1.get(name);  //(X)check query file & * with value=TF*IDF//
						}
						//System.out.println(name+"  "+hmqry.get(name)+"  "+hmqryidf.get(name)+" "+X);		
					}
					
					cal=Math.sqrt(p)*Math.sqrt(q);
					doc1=X/cal;
					System.out.println();System.out.println();
				    System.out.println(doc1);
				     
				    
				  //==============================//
					 //******    DOC2   ******//    
				  //==============================//
				    
				    p=q=0;
					X=Y=doc2=cal=0;
					
//					System.out.println("lllllllllllllllll");
					for(String name:hmispts.keySet())
					{
						A=0;
						A=hmispts.get(name)*wdidf.get(name);
						p+=A*A;
						hmdoc2.put(name,A);
//						System.out.println(name+"  "+hmispts.get(name)+"  "+wdidf.get(name)+" "+p);
					}
					for(String name:hmqry.keySet())
					{
						B=0;				
						B=hmqry.get(name)*hmqryidf.get(name);
						q+=B*B;
						hmqrydoc2.put(name,B);
//						System.out.println(name+"  "+hmqry.get(name)+"  "+hmqryidf.get(name)+" "+q);		
					}
					for(String name:hmqry.keySet())
					{	
						if(hmdoc2.get(name)!=null)
						{
							X+=hmqrydoc2.get(name)*hmdoc2.get(name);
						}
//						System.out.println(name+"  "+hmqry.get(name)+"  "+hmqryidf.get(name)+" "+X);		
					}
				
					cal=Math.sqrt(p)*Math.sqrt(q);
					doc2=X/cal;
					System.out.println();System.out.println();
				    System.out.println(doc2);
				    
				    
				    
				   //==============================//
					 //******    DOC3   ******//    
				  //==============================//
				    
				    p=q=0;
					X=Y=doc3=cal=0;
					
//					System.out.println("lllllllllllllllll");
					for(String name:hmnal.keySet())
					{
						A=0;
						A=hmnal.get(name)*wdidf.get(name);
						p+=A*A;
						hmdoc3.put(name,A);
//						System.out.println(name+"  "+hmnal.get(name)+"  "+wdidf.get(name)+" "+p);
					}
				
					for(String name:hmqry.keySet())
					{
						B=0;				
						B=hmqry.get(name)*hmqryidf.get(name);
						q+=B*B;
						hmqrydoc3.put(name,B);
//						System.out.println(name+"  "+hmqry.get(name)+"  "+hmqryidf.get(name)+" "+q);		
					}
					
					for(String name:hmqry.keySet())
					{	
						if(hmdoc3.get(name)!=null)
						{
							X+=hmqrydoc3.get(name)*hmdoc3.get(name);
						}
//						System.out.println(name+"  "+hmqry.get(name)+"  "+hmqryidf.get(name)+" "+X);		
					}
				
					cal=Math.sqrt(p)*Math.sqrt(q);
					doc3=X/cal;
					System.out.println();System.out.println();
				    System.out.println(doc3);
				    
				    
				    //==============================//
					 //******    DOC4   ******//    
				   //==============================//
				    p=q=0;
					X=Y=doc4=cal=0;
					
//					System.out.println("lllllllllllllllll");
					for(String name:hmtain.keySet())
					{
						A=0;
						A=hmtain.get(name)*wdidf.get(name);
						p+=A*A;
						hmdoc4.put(name,A);
//						System.out.println(name+"  "+hmtain.get(name)+"  "+wdidf.get(name)+" "+p);
					}
				
					for(String name:hmqry.keySet())
					{
						B=0;				
						B=hmqry.get(name)*hmqryidf.get(name);
						q+=B*B;
						hmqrydoc4.put(name,B);
//						System.out.println(name+"  "+hmqry.get(name)+"  "+hmqryidf.get(name)+" "+q);		
					}
					
					for(String name:hmqry.keySet())
					{	
						if(hmdoc4.get(name)!=null)
						{
							X+=hmqrydoc4.get(name)*hmdoc4.get(name);
						}
//						System.out.println(name+"  "+hmqry.get(name)+"  "+hmqryidf.get(name)+" "+X);		
					}
				
					cal=Math.sqrt(p)*Math.sqrt(q);
					doc4=X/cal;
					System.out.println();System.out.println();
				    System.out.println(doc4);
				    			
				    System.out.println();System.out.println();
				    System.out.println("BELOW THE FINAL RESULT:"); System.out.println(); 
				    System.out.println(doc1+"    "+doc2+"    "+doc3+"    "+doc4);
				    
				
				if(doc1>doc2&&doc1>doc3&&doc1>doc4)
				{
					System.out.println("document 1");
				}
				else if(doc2>doc1&&doc2>doc3&&doc2>doc4)
				{
					System.out.println("document 2");
				}
				else if(doc3>doc1&&doc3>doc2&&doc3>doc4)
				{
					System.out.println("document 3");
				}
				else if(doc4>doc1&&doc4>doc2&&doc4>doc3)
				{
					System.out.println("document 4");
				}
				else{
					System.out.println("no one");
				}
				
				System.out.println();
				System.out.println();System.out.println(" thanks a lot god");
				
			/////  close all files///////
				
			 bw.close();
			 mr.close();
			 rj.close();
			 ck.close();
			 pk.close();
			 mr.close();
			 qy.close();
			
		}catch(Exception e){
			System.out.println("not found");
		}	
		
	}
}