public class InsertionSorting{

	void sort(int arr[])
	{
		int n = arr.length;		// declaring the length n as the length of the given array
		for(int i=0; i<n; i++){  //looping till the last of the array
		int valuecom = arr[i]; //creating the variable shift to store the array value
		int j = i-1;  
		      			//assigning the i-1 value to the a variable
		while(j>=0 && arr[j]>valuecom){ //while loop here compare j meaning the initial array value to the
			arr[j+1] =arr[j];			// adjacent element.if greater than 1 and the compared value j
			j=j-1;
		}
		arr[j+1] = valuecom; //storing the arr[j] to that valuecom, comparing 
		}   
	}
	static void PrintingArray(int arr[]){ ///Function to print the array values in sorted when main method called 
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.println(+arr[i] +"");
		}
		System.out.println();
	}
	public static void  main (String[] args){
		int arr[]= {2,4,9,99,8,3,44};
		//System.out.print("The initial array, in unsorted array is:"+arr[i]);
		// for(int i=0;i<arr.length;i++){
		// 	System.out.println(+arr[i]);
		// }
		
		InsertionSorting obj1 = new InsertionSorting();
		obj1.sort(arr);
		obj1.PrintingArray(arr);
	}
}