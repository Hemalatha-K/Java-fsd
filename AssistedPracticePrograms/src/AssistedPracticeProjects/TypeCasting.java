package AssistedPracticeProjects;

public class TypeCasting {
public static void main(stringDemo[] args) {
		
		//implicit conversion
		System.out.println("Implicit type casting");
		char V='A';
		System.out.println("Value of a: "+V);
		
		int P=V;
		System.out.println("Value of b: "+P);
		
		float Q=V;
		System.out.println("Value of c: "+Q);
		
		long D=V;
		System.out.println("Value of d: "+D);
		
		double E=V;
		System.out.println("Value of e: "+E);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit TypeCasting");
		//explicit conversion
		
		double i=45.5;
		int j=(int)i;
		System.out.println("Value of x: "+i);
		System.out.println("Value of y: "+j);
		
}
}
