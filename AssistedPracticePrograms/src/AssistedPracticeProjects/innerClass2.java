package AssistedPracticeProjects;

public class innerClass2 {
	private String m="Inner Classe";

	 void display(){  
		 class Inner{  
			 void m(){
				 System.out.println(m);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.m();  
	 }  

	 
	public static void main(String[] args) {
		innerClass2  ob=new innerClass2 ();  
		ob.display();  
		

}
}
