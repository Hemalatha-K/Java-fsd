package Package1;

public class InnerClass1 {
	private String m="Java"; 
	 
	 class Inner{  
	  void h(){System.out.println(m+",Inner Classes");}  
	 }  


	public static void main(String[] args) {

		InnerClass1 obj=new InnerClass1();
		InnerClass1.Inner in=obj.new Inner();  
		in.h();  
	}

}
