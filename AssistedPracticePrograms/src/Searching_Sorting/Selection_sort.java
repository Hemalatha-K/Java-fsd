package Searching_Sorting;



public class Selection_sort {
	 public static void main(String[] args) {

		    int[] arr = {8,6,3,1,2,3,5};
		    int length = arr.length;
		    selection_sort(arr);
		    System.out.println("The sorted elements are:");
		    for(int i:arr)
		    {

		        System.out.println(i);
		         }
		     }

		    public static void selection_sort(int[] arr){

		        for(int i=0;i<arr.length-1;i++){
		        	int index =i;
		            for(int j=i+1;j<arr.length;j++){
		                if(arr[j]<arr[index]){

		                    index =j;
		                }

		            }
		            int smallNumber = arr[index];
		            arr[index]= arr[i];
		            arr[i]= smallNumber;
		        }

		    }

}
