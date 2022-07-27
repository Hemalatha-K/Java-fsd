package Phase1Projects;
import java.util.ArrayList;
import java.util.Scanner;     
public class EmailID {  
	    public static void main(String args[])
	    {  
	    	ArrayList<String> Email = new ArrayList<String>();
	        //using add() to initialize values
	        Email.add("priya@gmail.com");
	        Email.add("kaviya@gmail.com");
	        Email.add("manasi@gmail.com");
	        Email.add("pugazh@gmail.com");
	        Email.add("shan@gmail.com");
	        Email.add("arun@gmail.com");
	        Email.add("keshwani@gmail.com");
	        //Getting input from user using Scanner class
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter email: ");
	        String SearchEmail = input.nextLine();
	        input.close();
	        // using contains() to check if the element
	        boolean ans = Email.contains(SearchEmail);
	        if(ans){
	            System.out.print("Entered EmailID is Found");
	        }
	        else{
	           System.out.println("Entered EmailID is not found");
	        }
	            
	    }

	}  


