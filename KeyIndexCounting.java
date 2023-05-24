public class KeyIndexCounting{
	public static void main (String[] args){
		int [] arr = {2,1,4,8,4,6,9,10,2};
		int n = arr.length;
		int R = 256;
		int aux[]= new int[arr.length];
		int count[] = new int[R+1];

		for(int i=0; i<n;i++){
			count[arr[i]+1]++; 
		}
		for(int j = 0; j<R; j++){
			count[j+1]+=count[j];
		}
		for(int k=0; k<n;k++){
			aux[count[arr[k]]++] = arr[k];
		}
		for(int i=0;i<n;i++){
			arr[i] = aux[i];
		}
		for(int i=0; i<n;i++){
			System.out.print(" " +arr[i]);
		}
		System.out.print(" ");
	}
} 