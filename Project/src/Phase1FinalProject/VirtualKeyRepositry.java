package Phase1FinalProject;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VirtualKeyRepositry {
 public static void main(String[] args) {
 
       System.out.println("\t..........Welcome to The Application ............\t");
       options();
 }
 
   private static void options() {
       String[] arr = {"\t1. Retrieving Files in ascending order\t",
               "\t2. performing Business-level operations\t",
               "\t3. Closing the application\t"
       };
       int[] a = {1, 2, 3};
       int len = a.length;
       for(int i=0; i<len;i++){
           System.out.println(arr[i]);
           // display the all the Strings mentioned in the String array
       }
       System.out.println("\nEnter your choice:\t");
       Scanner sc = new Scanner(System.in);
       int  options =  sc.nextInt();
       
               switch (options){
               case 1:
                System.out.println("Names of the Files :\n");
                sortFile();
                System.out.print("\n");
                options();
                break;
               
               case 2:
                BusinessOperations();
                break;
   
    case 3:{
    System.out.println("Closing your application... \nThank you!");
    break;
    }
    default :{
    System.out.println("Entered option is incorrect \n"
    + "Please choose the Correct Option");
  System.out.print("\n");
                options();
                break;
    }
               }  
   }
   
   public static void createWriteFile(){
try {
System.out.println("Enter how many file you want to create ? ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++) {
System.out.println("Enter the filename :");
Scanner sc1=new Scanner(System.in);
String filename=sc1.next();
   File file=new File("C:\\New folder\\"+filename+".txt");
 
   
   System.out.println("Write anything in this current file : ");
Scanner sc2=new Scanner(System.in);
String content=sc2.nextLine();
   FileWriter writer=new FileWriter(file);
writer.write(content);
writer.flush();
writer.close();
}
System.out.println("Files are created !");
}
catch(IOException e) {
e.printStackTrace();
}
}

public static void sortFile() {
File file=new File("C:\\New folder\\");
File[] Main=file.listFiles();
for(File f: Main) {
if(f.isFile())
System.out.print(f.getName());
System.out.print("\n");
}

}

public static void deleteFile()  {

System.out.println("Enter the filename that you want to delete");
Scanner sc=new Scanner(System.in);
String deletefile=sc.next();
File file=new File("C:\\New folder\\"+deletefile+".txt");
file.delete();
boolean present = file.exists();
if(present==false) {
System.out.println(deletefile+" is deleted");}
else {
    System.out.println(deletefile+" is not found"); }
}
public static void searchFile(){
try {
System.out.println("Enter the filename that you want to search");
Scanner sc=new Scanner(System.in);
String search=sc.next();
File file=new File("C:\\New folder\\"+search+".txt");
FileReader reader=new FileReader(file);
int data;
while((data=reader.read())!=-1) {
System.out.print((char)data);}
}
catch(IOException e) {
e.printStackTrace();}
}
public static void BusinessOperations() {
String[] arr1 = {"1. Add a user specified file to the application",
               "2. Delete a user specified file from the application",
               "3. Search a user specified file from the application",
               "4. Close the application" };
int[] b = {1, 2, 3, 4};
int len1 = b.length;
for(int i=0; i<len1;i++){
System.out.println(arr1[i]);
           // display the all the Strings mentioned in the String array
}
System.out.println("\nSelect your option :\t");
Scanner s = new Scanner(System.in);
int  option =  s.nextInt();
 
switch(option) {
case 1:{
createWriteFile();
System.out.print("\n");
  BusinessOperations();
  break;
  }
case 2:{
deleteFile();
System.out.print("\n");
BusinessOperations();
break;
}
case 3:{
searchFile();
System.out.print("\n");
BusinessOperations();
break;
}
case 4:{
System.out.println("Exit");
System.out.print("\n");
options();
break;
}
default:{
System.out.println("Entered option is INVALID!! \n"
+ " Please Select Correct option");
System.out.print("\n");
BusinessOperations();
}
}
}
}