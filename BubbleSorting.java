public class BubbleSorting {

    static void sort(int arr[]){
        int n = arr.length;
        int tem=0;
        for(int i=0; i<n; i++){
            for(int j=1; j<n-i; j++){
                if(arr[j-1]>arr[j]){
                    //In bubble sorting, first two element of the beginning compare and see whether they are in order or not,
                    //if the two element are in order, compare higher element with the next element till the last .
                    //again it starts from the beginning till the last ,,repeating the process again 
                    //Swapping the element here
                    tem = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=tem;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[]={2,5,4,8,9,1,3};
        System.out.println("This is the initial array before bubble sort:");
        for(int bubble=0;bubble<arr.length; bubble++ ){
            System.out.println(arr[bubble] +"");
        }
        System.out.println();

        sort(arr);
        System.out.println("This is the initial array after bubble sort:");

        for(int bubble=0;bubble<arr.length; bubble++ ){
            System.out.println(arr[bubble] +"");
        }
    }
}
