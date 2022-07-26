package MethodOperations;
public class MethodOverload {
	public void area(int b,int h)
    {
         System.out.println("Rectangle= "+(b*h));
    }
    public void area(int r) 
    {
         System.out.println("circle="+(3.14*r*r));
    }
    public static void main(String args[])
    {

       MethodOverload ob=new MethodOverload();
        ob.area(14,13);
        ob.area(5);  
    }
 }



