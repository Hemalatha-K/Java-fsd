package MethodOperations;

public class MethodExecution {
	public int multipynumbers(int i,int j) {
		int p=i*j;
		return p;
	}
	public static void main(String[] args) {

		MethodExecution b=new MethodExecution();
		int ans= b.multipynumbers(1,13);
		System.out.println("Multipilcation="+ans);
		}


}
