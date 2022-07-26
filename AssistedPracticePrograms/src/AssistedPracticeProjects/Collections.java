package AssistedPracticeProjects;
import java.util.*;
public class Collections {
	public static void main(stringDemo[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> C=new ArrayList<String>();   
	      C.add("Mumbai");//
	      C.add("Bangladesh");    	   
	      System.out.println(C);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> v = new Vector();
	      v.addElement(90); 
	      v.addElement(80); 
	      System.out.println(v);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Praveen");  
	      names.add("Maanasi");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(107);  
	       set.add(108);  
	       set.add(109);
	       set.add(110);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> s2=new LinkedHashSet<Integer>();  
	       s2.add(21);  
	       s2.add(23);  
	       s2.add(22);
	       s2.add(24);	       
	       System.out.println(s2);
	      	} 
	      }  
	}




