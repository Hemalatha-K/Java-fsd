package Package1;

public class CallByValueMethod {

	int n=150;

	int operation(int n) {
		n =n*10/100;
		return(n);
	}

	public static void main(stringDemo args[]) {
		CallByValueMethod o = new CallByValueMethod();
		System.out.println("Before operation value of data is "+o.n);
		o.operation(100);
		System.out.println("After operation value of data is "+o.n);
		}

}
