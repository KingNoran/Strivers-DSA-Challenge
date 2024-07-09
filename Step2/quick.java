import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quick{
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        System.out.println("Before the sort:");
        for(int i : arr) System.out.print(i + " ");
        System.out.println();
        arr = Solution.QScall(arr);
        System.out.println("After the sort:");
        for(int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}

class Solution{
    static int split(List<Integer> arr, int low, int high){
        int pivot = arr.get(high); // Get the pivot
        // Get the low and high indexes
        int i = low;
        int j = high;
        // Loop each element of the array
        while(i < j){
            // While the element at the lowest index is lower than pivot, increment. 
            // This meets the elements higher than the pivot at the left side of the array
            while(arr.get(i) <= pivot && i <= high - 1) i++;
            // While the element at the highest index is higher than the pivot, decrement.
            // This meets the elements lower then the pivot at the right side of the array
            while(arr.get(j) > pivot && j >= low + 1) j--;

            // This swaps the accumulated indexes, which presumably caught elements out of their place
            if (i < j){
                int tmp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, tmp);
            }
        }
        // After looping the entire array, swap the lowest element with the recent high element (presumably the pivot)
        int tmp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, tmp);
        // Return the index of the pivot
        return j;
    }

    static void quickSort(List<Integer> arr, int low, int high){
        // Set Base Case
        if(low < high){ // As long as the low index is lower than the high index, recurse
            // Get the split index
            int splitIndex = split(arr, low, high);
            // Recurse using the lower half of the array. Exclude the split index
            quickSort(arr, low, splitIndex - 1);
            // Recurse using the higher half of the array. Exclude the split index
            quickSort(arr, splitIndex + 1, high);
        }
    }

    public static List<Integer> QScall(List<Integer> arr){
        // This calls the method
        quickSort(arr, 0, arr.size() - 1);
        return arr;
    }
}