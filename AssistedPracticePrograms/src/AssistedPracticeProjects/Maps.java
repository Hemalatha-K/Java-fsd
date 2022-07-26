package AssistedPracticeProjects;
import java.util.*;
public class Maps {
	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Vinai");    
	      hm.put(2,"Malar");    
	      hm.put(3,"Kavi");   
	       
	      System.out.println("\nHashmap: ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Arul");  
	      ht.put(5,"Riyaz");  
	      ht.put(6,"Jashwanth");  
	      ht.put(7,"geetha");  

	      System.out.println("\nHashTable:");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Apple");    
	      map.put(9,"Ball");    
	      map.put(10,"Cat");       
	      
	      System.out.println("\n TreeMap:");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	}  

}
