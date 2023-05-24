public class LsdSorting{/*Question2*/
	public static void sort(int x){
		/*Sorting arr[] on leading x character*/
		String arr[]={"Pema","Dawa","Wang","Bike"};
		int n = arr.length;
		int R = 256;
		String[] aux = new String[n];

		for(int i=x-1; i>=0; i--){
			/*sorting by key index counting on the ith character*/

			int[] count = new int[R+1];	
			/*compute the frequency of count */	
			for(int j=0;j<n;j++){
					/*creating count array to hold the counting */
				count[arr[j].charAt(i)+1]++;
			}
				/*Transforming the counting into the indices*/
			for(int  k=0; k<R; k++){
				count[k+1]+=count[k];
			}
			for(int l=0;l<n;l++){
				aux[count[arr[l].charAt(i)]++]= arr[l];
			}
				/*copying the array back to arr[]*/
			for(int l=0; l<n;l++){
				arr[l] = aux[l];
			}
		}
		for(int l=0; l<n; l++){
			System.out.println("" +arr[l]);
		}
		System.out.println("");
	}

	public static void main(String[] args){
		sort(3);

		
	}
}


