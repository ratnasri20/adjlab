package example;
import java.util.*; 
public class hashtable {
	 public static void main(String args[]){  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(1201,"Ratnasri");  
		  hm.put(1202,"likhita");  
		  hm.put(1203,"nikhita");  
		  hm.put(1204,"amrutha");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  	
}
