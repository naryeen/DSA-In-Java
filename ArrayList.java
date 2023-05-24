
//Question2:
//	Complete the incomplete functions in the ArrayList(Dynamic array API) class. There are 5 incomplete 
//	functions inside the class which are:
//	1) add() - which takes a generic variable as a parameter and adds the element to the dynamic array. 
//			   Insert elements into a dynamic array which doubles in size when the array is 3/4th full 
//			   and halves in size when the array is 1/4th full
//	2) pop() - this function does not take a parameter.When called pop deletes the last element in the dynamic array.
//	3) resize() - this function takes one integer parameter. When called resize changes the size of the array
//				to the value of the parameter sent.
//	4) size() - Does not take ay parameter and returns the number of elements present in the dynamic array.
//	5) toString() - Does not take any parameter and returns the string representation of the dynamic array.
import java.util.*;

public class ArrayList {
    int arr[];      //declaring the arr variable
    int length;      //declaring the length variable
    int count = 0;     //initializing the the count variable to 0
    int seven_full;     //creating variable for the 75%
    int two_full;         //creating the variable for 25%

    public ArrayList(int len) {
        length = len; // assigning the len to length
        arr = new int[length];  //
        seven_full = (75 * length) / 100;
        two_full = (25 * length) / 100;
    }

    public void add(int ele) {
        if (count == 0) {
            arr[count] = ele;

        }
        else{
            arr[count]=ele;
        }
        count++;
    }

    public void pop() {
        if (count > 0) {
            arr[count - 1] = 0;
        }
        count--;
    }

    public void resize(int length) {
        if (count == seven_full) {
            int tem[] = new int[length * 2];
            for (int i = 0; i < count; i++) {
                tem[i] = arr[i];

            }
            length = length * 2;
            arr = tem;
        }
        if (count == two_full) {
            int tem[] = new int[length / 2];
            for (int i = 0; i < count; i++) {
                tem[i] = arr[i];

            }
            length = length / 2;
            arr = tem;
        }

    }
    public int size() {
        return length;

    }

    public String toString() {
        String str = Arrays.toString(arr);
        return str;
    }

    public static void main(String[] args) {
        ArrayList obj = new ArrayList(8);
        obj.add(3);
        obj.add(2);
        obj.add(7);
        obj.add(30);
        obj.add(11);
        obj.add(99);


        // System.out.println("Testcase3 passed"+obj.size());
        //System.out.println(" Testcase3 passed"+obj.toString());
        assert(obj.size() == 8);
        assert(obj.toString() == " [3,2,7,30,11,99,0,0] ");
        System.out.print("Testcase3 passed");
    }
}