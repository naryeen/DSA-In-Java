public class SelectionSorting{

	void sort(int arr[]){
		 //This is a selection sorting
		int n=arr.length;
		for(int i=0; i<n-1; i++)
		{
			//finding the minimum element in the given array
			int ele=i;
			for(int j=i+1; j<n; j++)
			{
				//finding the minimum element in the unsorted array
				if(arr [j]<arr[ele]){
					ele=j;
					//swaping with the first element if not in sorted order
				}
			int tem=arr[ele];
			arr[ele]=arr[i];
			arr[i]=tem;
			}
			//System.out.println(arr[ele]+"");
		}                                                                     
	}
	//printing the array
	void PrintingArray(int arr[]){
		//int arr[];
		int n=arr.length;
		for(int i=0; i<n; i++){
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}

	public static void main (String[] args){
		SelectionSorting ob=new SelectionSorting();
		int arr[] = {6,3,8,2,9,1};
		ob.sort(arr);
		System.out.println("This is a selection Insertion Sorting");
		ob.PrintingArray(arr);
	}
}
