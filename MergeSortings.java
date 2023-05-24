class MergeSorting {
    //first sub array us [lo...mid]
    //second sub array is [mid+1...hi]
    void merge(int arr[], int lo, int mid, int hi) {
        // Finding the size of the sub array thar are to be merged 
        int x = mid - lo + 1;
        int y = hi - mid;
        // creating teporarily array to stored the sub array
        int L[] = new int[x];
        int R[] = new int[y];
        //coppying the values of the sub array to the temporarily created variables
        for (int i = 0; i < x; i++)
            L[i] = arr[lo + i];
        for (int j = 0; j < y; j++)
            R[j] = arr[mid + 1 + j];

        // initialization of variable i and j as 0
        int i = 0, j = 0;

        //initial index of the merged sub array
        int a = lo;
        while (i < x && j < y) {
            if (L[i] <= R[j]) {
                arr[a] = L[i];
                i++;
            } else {
                arr[a] = R[j];
                j++;
            }
            a++;
        }
        // copying the remaining element of leftArraySorting(L)
        while (i < x) {
            arr[a] = L[i];
            i++;
            a++;

        }
        // copying the remaining element of RightArraySorting(R)
        while (i < y) {
            arr[a] = R[j];
            j++;
            a++;

        }
        // now merging the array
    }

    // mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    void sort(int arr[], int lo, int hi) {
        if (lo < hi) {
            // finding the middle point
            int mid = (lo + hi) / 2;
            // sorting first and second half
            sort(arr, lo, mid);
            sort(arr, mid + 1, hi);
            // merging the sorted halves in the declared variable array
            merge(arr, lo, mid, hi);
        }

    }

    // print array to standard output
    static void show(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 100,8, 3,94, 10, 9, 4, 0, 1 };
        System.out.println("The given array is:");
        show(arr);

        MergeSorting ob = new MergeSorting();
        ob.sort(arr, 0, arr.length - 1);
        System.out.println("\nThe sorted array is:");
        show(arr);
    }
}

