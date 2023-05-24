public class Binary{
    int binarySearch(int arr[],int low, int m, int targetElement){
        if(m >= low){
            int mid = low + (m-low)/2;
        
            if(arr[mid]==targetElement){/*if the target element is in middle*/
                return mid;
            }
            if(arr[mid]>targetElement){/*if the target element is smaller than mid values*/
                return binarySearch(arr, low, mid-1, targetElement);
            }
            /*if element is in right sub tree*/
            return binarySearch(arr, mid+1, m, targetElement);
           
        }
        return -1;
    }

    public static void main(String[] args){
        Binary object = new Binary();
        int arr[] = {1,2,4,5,6,8,9,12};
        int n = arr.length;
        int a = 9;
        int display = object.binarySearch(arr, 0, n-1,a);
        if (display == -1){
            System.out.println("The elemnet is not found");
        }
        System.out.println("The elemnet is found at index: " +display);


    }
}

