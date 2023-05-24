class LinearSearch{
	public static int LinerSearch(int arr[],int x ){
		int n = arr.length;
		for(int i=0;i<n; i++){
			if (arr[i]==x){
				return i;
			}
			
		}
		return -1;
	}
	public static void main(String args[]){
		int arr[] = {2,4,6,1,7,1}; /*if you assigned double same value, the value in first index is taken*/
		int x =1;
		//function calling
		int display = LinerSearch(arr,x);
		if (display == -1){
			System.out.println("The elemnet is not found");
		}
		else{
			System.out.print("The elemnet is found at index: " +display);
		}
	}
}

