package example;
import java.util.*;  
public class hashmap { 
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"carrot");  //Put elements in Map  
   map.put(2,"potato");    
   map.put(3,"tomato");   
   map.put(4,"brinjal");   
       
   System.out.println("size of hashmap = "+map.size());  
   if(map.containsKey(1)){
	 String a = map.get(1);
     System.out.println("value of key \"1\" is "+a);    
   }  
}  
}
